
<template>
  <div id="app">
      <Trans @emitTrans="getTranslate"></Trans>
      <TransResutl v-text="results"></TransResutl>
  </div>
</template>
<script>
import Trans from './components/translate/trans'
import TransResutl from './components/translate/trans-result'
import md5 from 'js-md5'

// eslint-disable-next-line to ignore the next line.
/* eslint-disable */
export default {
  name: 'App',
  methods: {
      getTranslate: function(val, option){
        var appKey = '4f25b1ccf284adf3';
        var key = 'A7awGWwz35nHNrUhKshD9ubDmr8BT6uD';
        var salt = (new Date).getTime();
        var query = val;
        // 多个query可以用\n连接  如 query='apple\norange\nbanana\npear'
        var from = 'zh-CHS';
        var to = option;
        var str1 = appKey + query + salt +key;
        var sign = md5(str1);
        this.$http.jsonp("http://openapi.youdao.com/api", {
             params: {
                q: query,
                appKey: appKey,
                salt: salt,
                from: from,
                to: to,
                sign: sign
             }
        }).then(res => {
            this.results = res.body.translation[0];
        })
      }
  },
  components: {
    Trans,
    TransResutl
  },
  data() {
    return {
      results: ''
    }
  }
}
</script>

<style>
</style>

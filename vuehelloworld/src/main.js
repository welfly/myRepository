// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import 'babel-polyfill'
import vurResource from 'vue-resource'
import md5 from 'js-md5'

Vue.use(vurResource)
Vue.config.productionTip = false
Vue.prototype.$md5 = md5

// eslint-disable-next-line
/* eslint-disable */
new Vue({
  el: '#app',
  components: {
    App
  },
  template: '<App/>',
})

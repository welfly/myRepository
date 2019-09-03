<template>
    <div id="trans">
        <input v-model="msg" />
        <select v-model="option">
          <option value="en">English</option>
          <option value="ja">Japanese</option>
          <option value="ru">俄语</option>
          <option value="vi">越南语</option>
          <option value="auto">auto</option>
        </select>
        <button @click="translate">翻译</button>
    </div>
</template>
<script>
export default {
  name: 'trans',
  data: function () {
    return {
      msg: 'test',
      option: 'auto'
    }
  },
  methods: {
    translate: function (e) {
      this.$emit('emitTrans', this.msg, this.option)
    }
  }
}
</script>
<style scoped>

</style>

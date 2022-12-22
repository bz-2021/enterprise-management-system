const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
  devServer: {
    proxy: {
      '/employee': {
        target: 'http://localhost:8083',
      },
      '/department': {
        target: 'http://localhost:8083',
      },
      '/verification': {
        target: 'http://localhost:8083',
      },
      '/password': {
        target: 'http://localhost:8083',
      },
      '/attendance': {
        target: 'http://localhost:8083',
      },
    },
  },
})

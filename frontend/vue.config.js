const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
  devServer: {
    proxy: {
      '/employee': {
        target: 'http://localhost:8099',
      },
      '/department': {
        target: 'http://localhost:8099',
      },
      '/verification': {
        target: 'http://localhost:8099',
      },
      '/password': {
        target: 'http://localhost:8099',
      },
      '/attendance': {
        target: 'http://localhost:8099',
      },
    },
  },
})

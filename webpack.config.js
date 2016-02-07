var path = require('path');
var webpack = require('webpack');
 
module.exports = {
  entry: path.join(__dirname, 'src/js/main.js'),
  output: { path: path.join(__dirname, 'resources/public'), filename: 'bundle.js' },
  module: {
    loaders: [
      {
        test: /.jsx?$/,
        exclude: /node_modules/,
        loader: 'babel-loader',
        query: {
          presets: ['es2015', 'react']
        }
      }
    ]
  },
};

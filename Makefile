create_from_scratch:
	brew install leiningen
	lein new compojure dashy
	npm init

install:
	npm install --save react@0.14.7
	npm install --save react-dom@0.14.7
	npm install --save-dev webpack@1.12.12
	npm install --save-dev babel-loader@6.2.1
	npm install --save-dev babel-core@6.4.5
	npm install --save-dev babel-preset-es2015@6.3.13
	npm install --save-dev babel-preset-react@6.3.13

start_dev:
	./node_modules/webpack/bin/webpack.js --watch& lein ring server

start:

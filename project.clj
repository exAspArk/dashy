(defproject dashy "0.1.0"
  :description "Dashboard framework in Clojure with React"
  :url "https://github.com/exAspArk/dashy"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [compojure "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [clj-yaml "0.4.0"]]
  :plugins [[lein-ring "0.9.7"]
            [cider/cider-nrepl "0.10.2"]
            [hiccup "1.0.5"]]
  :ring {:handler dashy.handler/app
         :auto-reload? true
         :auto-refresh? true}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})

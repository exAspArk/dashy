(ns dashy.handler
  (:require (compojure [core :refer [defroutes GET]]
                       [route :as route])
            (ring.middleware [defaults :as middlewares])
            (dashy [config :refer [config]]
                   [pages :as pages]
                   [api :as api])))

(defroutes app-routes
  (GET "/" []
    (pages/index-page config))
  (GET "/api/:resource-name" [resource-name]
    (api/resource-api resource-name config))
  (route/not-found "Not Found"))

(def app
  (middlewares/wrap-defaults app-routes middlewares/site-defaults))

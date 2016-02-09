(ns dashy.config
  (:require [clj-yaml.core :as yaml]))

(def ^:const config-file-path "./config.yml")

(defn- load-config-file []
  (yaml/parse-string (slurp config-file-path)))

(def config
  (memoize load-config-file))

(ns palestra-clojure.core)

(defn handler [request]
  {:status 200
    :headers {"Content-Type" "text/html"}
    :body "Hello World"})
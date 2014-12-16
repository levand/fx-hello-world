(ns fx-hello-world.hello)

(defn hello
  "Hello world in CLJC"
  []
  #+clj (println "Hello from Clojure")
  #+cljs (.log js/console "Hello from ClojureScript"))
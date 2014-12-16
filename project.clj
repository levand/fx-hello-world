(defproject fx-hello-world "0.1.0-SNAPSHOT"
  :description "Check out those succulent feature expressions"
  :source-paths ["src"]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.7.0-fx-SNAPSHOT"]
                                  [org.clojure/clojurescript "0.0-fx-SNAPSHOT"]]
                   :plugins [[lein-cljsbuild "1.0.4-fx-SNAPSHOT"]]
                   :cljsbuild {:builds [{:source-paths ["src"]
                                         :compiler {:output-to "target/fx-hello-world.js"
                                                    :optimizations :whitespace
                                                    :pretty-print true}}]}}})

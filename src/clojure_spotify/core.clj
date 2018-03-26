(ns clojure-spotify.core
  (:require [clojure.string :as string]))

(defn -main []
 (println "Hello, World!"))

(defn dec->binary [dn]
  (Integer/toBinaryString dn))

(defn binary->decimal [bn]
 (Integer/parseInt bn 2))

(defn puzzle3 [in]
 (binary->decimal (string/reverse (dec->binary in))))

(string/reverse (dec->binary 14))
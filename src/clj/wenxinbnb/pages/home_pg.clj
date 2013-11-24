(ns wenxinbnb.pages.home_pg
    (:use hiccup.core
          hiccup.page
          r0_rich.pages.template_pg)
    (:require [clojure.string :as s]
              [clojure.java.io :refer [file]]
              [me.raynes.laser :as laser]))

(def index (laser/document
   (laser/parse (file "resources/public/t_index.html"))
   (laser/class= "content")
   (laser/content "injected content")))

(ns richweb.app)

(set! (.-onload js/window)
      (let [loading_img (.getElementById js/document "loading")]
        (fn [] (do (set! (-> loading_img (.-style) (.-opacity)) "0")
                   (set! (-> loading_img (.-style) (.-visibility)) "hidden")))))

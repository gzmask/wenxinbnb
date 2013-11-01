(ns richweb.controls.control
  (:use richweb.pages.page
        net.cgrand.enlive-html)
  (:require [clojure.xml :as xml]))

(defn wordpress-xml-parse [xmlurl]
  (let [xmlfeed (xml/parse xmlurl)]
    (into []
    (for [x (:content ((:content xmlfeed) 0)) :when (= :item (:tag x))]
      {:title ((:content ((:content x) 0)) 0)
       :time ((:content ((:content x) 3)) 0)
       :body ((:content ((:content x) 8)) 0)}))))

(def home_news [ 
                {:title "Openning Sale"
                 :time "6th, August, 2013"
                 :body [:div.row-fluid 
                        [:div.span6 
                          [:a {:href "/img/eng_ad.jpg"
                               :target "_blank"} 
                          [:img {:src "/img/eng_ad.jpg"
                                 :width "250px"}]]] 
                        [:div.span6 
                          [:a {:href "/img/skcn_ad.jpg"
                               :target "_blank"} 
                          [:img {:src "/img/skcn_ad.jpg"
                                 :width "250px"}]]]]}
                {:title "Welcome Message:" 
                 :time "26th, July, 2013"
                 :body [:div "Hello Dear customers. This is Richever Tech. We are a group of technology enthusiasts. We believe that computers can be cost effective and green, yet powerful. We are working hard to bring affordable computing technologies to Regina. We have an affordable line of linux powered PCs in store, and variable mobile accessories to enable your mobile devices. As for businesses, we got a team of high portfolio web developers to help your business growth. Welcome."]}
                {:title "Store open!" 
                 :time "24th, July, 2013"
                 :body [:div "Store is now open. Welcome to our store at 2139 8th Ave. We are having an openning sale event in store right now."]}
                {:title "Store grand openning" 
                 :time "16th, July, 2013"
                 :body [:div "Store is openning this week."]}
                {:title "Web Site Offically Launch" 
                 :time "10th, July, 2013"
                 :body [:div "Welcome to Richever.ca. Our website is still under very heavy development. Please check back on us frequently and you will be able to see lots of improvements."]} 
                {:title "Website is under heavy development"
                 :time "29th, March, 2013"
                 :body [:div "Our website is under development and will be launch soon!"]}
                {:title "Website Draft online"
                 :time "6th, January, 2013"
                 :body [:div "Our draft of the website is online!"]}])

(def store_news [ {:title "Richever Store open"
                   :time "24th, July, 2013" 
                   :body [:div "Our brick-and-mortar store is now open at 2139 8th Ave, Regina, Saskatchewan! Please checkout our openning sale."]}])

(def dev_news [{:title "Immediate response web apps" 
                :time "30th, July, 2013" 
                :body [:div "An immediate response web site is that you click into a button of the website, it gives the result immediately without loading the internet for information results. Carmens' Tea is an immediate response website: " [:a {:href "http://www.carmenstea.ca" :target "_blank"} "Carmens' Tea"]]}
               {:title "Web office" 
                :time "26th, July, 2013" 
                :body [:div "Our Web Development office is open at 2139 8th Ave, Regina"]} 
               {:title "Carmen's tea is launched!"
                :time "2nd, March, 2013"
                :body [:div "please visit " 
                       [:a {:href "http://www.carmenstea.ca"
                            :target "_blank"} "Carmens Tea "] 
                       "to check it out!"]}
               {:title "C&W renovations is launched!"
                :time "30th, January, 2013"
                :body [:div "please visit "
                       [:a {:href "http://www.cwrenos.ca"
                            :target "_blank"} "C&W Renos"]
                       " to check it out!"]}])

(def repair_news [ {:title "university discount"
             :time "26th, July, 2013"
             :body [:div "10% off discount for all university students and employees."]} ])

(def gallery_news [ {:title "design news"
             :time "20th, July, 2013"
             :body [:div "no news yet"]}])

(def team_news [ {:title "member news"
             :time "20th, July, 2013"
             :body [:div "no news yet"]}])

(def no_news [ {:title "404 not found"
             :time "20th, July, 2013"
             :body [:div "a not found is good found"]}])

(deftemplate home (html home_pg) [news]
  [:div#news_feed.row-fluid] (clone-for [item news]
                                        [:div.newshead] (content (:title item))
                                        [:div.newsbody] (html-content (:body item))
                                        [:div.newstime] (content (:time item))))

(deftemplate store (html store_pg) [news]
  [:div#news_feed.row-fluid] (clone-for [item news]
                              [:div.newshead] (content (:title item))
                              [:div.newstime] (content (:time item))
                              [:div.newsbody] (html-content (:body item))))

(deftemplate webdev (html webdev_pg) [news]
  [:div#news_feed.row-fluid] (clone-for [item news]
                              [:div.newshead] (content (:title item))
                              [:div.newstime] (content (:time item))
                              [:div.newsbody] (html-content (:body item))))

(deftemplate repair (html repair_pg) [news]
  [:div#news_feed.row-fluid] (clone-for [item news]
                              [:div.newshead] (content (:title item))
                              [:div.newstime] (content (:time item))
                              [:div.newsbody] (html-content (:body item))))

(deftemplate port (html port_pg) [news]
  [:div#news_feed.row-fluid] (clone-for [item news]
                              [:div.newshead] (content (:title item))
                              [:div.newstime] (content (:time item))
                              [:div.newsbody] (html-content (:body item))))

(deftemplate about (html about_pg) [news]
  [:div#news_feed.row-fluid] (clone-for [item news]
                              [:div.newshead] (content (:title item))
                              [:div.newstime] (content (:time item))
                              [:div.newsbody] (html-content (:body item))))

(deftemplate no (html no_pg) [news]
  [:div#news_feed.row-fluid] (clone-for [item news]
                              [:div.newshead] (content (:title item))
                              [:div.newstime] (html-content (:time item))
                              [:div.newsbody] (content (:body item))))

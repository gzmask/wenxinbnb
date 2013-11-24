(ns wenxinbnb.pages.css)

(defn main_css [] 
  {:headers {"Content-Type" "text/css"}
   :body "
          body {
            background-color: #fff;
            background-image: url('/img/bg.jpg');
            background-repeat: repeat-y;
            background-size: 1280px 800px;
            color: #000;
            font-family: advent-Bd1;}
          .trans_bg {
            padding: 10px;
            color: #fff;
            font-size: 18px;
            background-color: rgba(0,0,0,0.0);
          }
          a:link {color:#FFF;}      /* unvisited link */
          a:visited {color:#FFF;}  /* visited link */
          a:hover {color:#FFF;}  /* mouse over link */
          a:active {color:#FFF;}  /* selected link */
          div.hidenum {
           opacity: 0.0;
           transition: opacity 1s ease;
          }
          div.hidenum:hover {
           opacity: 1.0;
          }
          #qrcode {
            color: #000;
            background-color: #fff;
            padding: 15px;
          }
          div.content {
            font-size: 20px;}
          div.navigation_bar {
            background-color: #ccc;
            font-family: advent-Re;
            font-size: 20px;
            color: #0A578F;}
          :target {
            background-color: #fff;
          }
          @font-face {
            font-family: advent-Re;
            src: url('fonts/advent-Re.otf');}
          @font-face {
            font-family: advent-Lt1;
            src: url('fonts/advent-Lt1.otf');}
          @font-face {
            font-family: advent-Bd1;
            src: url('fonts/advent-Bd1.otf');}
          i.icon-camera-retro {
            color: #000;} "})

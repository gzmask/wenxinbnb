function printInvoice(ele) {
    var openWindow = window.open("", "Wenxin BnB invoice", "");
    var printable = "<img src=\"/img/wenxin_header.jpg\"><table><tr>" + 
          "<td>client name:" + document.getElementById("client_name").value + "</td></tr><tr>" + 
          "<td style='text-align:left; width: 500px;'>client telephone:" + document.getElementById("client_telephone").value + "</td>" +
          "<td style='text-align:right; width: 500px;'>checked in date: " + document.getElementById("client_checkin").value + "</td></tr><tr>" + 
          "<td style='text-align:left; width: 500px;'>client address:" + document.getElementById("client_address").value + "</td>"+
          "<td style='text-align:right; width: 500px;'>checked out date: " + document.getElementById("client_checkout").value + "</td></tr></table>" + 
          "<hr /><br /><br />" +
          ele.previousSibling.innerHTML; 
    openWindow.document.write(printable);
    openWindow.document.close();
    openWindow.focus();
    openWindow.print();
    openWindow.close();
}

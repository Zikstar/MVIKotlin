
console.log("hello from devtools script!");

chrome.devtools.panels.create("MVIKotlin Panel",
                              "heh.png",
                              "panel.html",
                              function(panel) { console.log("hello from callback"); });

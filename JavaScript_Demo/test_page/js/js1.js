/*
 * @Author: your name
 * @Date: 2021-04-06 21:15:16
 * @LastEditTime: 2021-04-06 21:24:55
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \work_space\Java_Demo\JavaScript_Demo\test_page\js\js1.js
 */
var flag = false; //全局变量
function show_menu() {
  var title1 = document.getElementById('title');
  if (flag) {
    title1.style.display = 'none';
    flag = false;
  } else {
    title1.style.display = 'block';
    flag = true;
  }
}
function show_menu1() {
  var title1 = document.getElementById('title');
  title1.style.display = 'none';
  flag = false;
}

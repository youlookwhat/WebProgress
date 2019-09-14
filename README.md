## WebProgress
一款Android WebView进度条显示控件，使其加载进度平滑过渡。

## Use
 - 建议直接将类拷贝到项目中：[WebProgress](https://github.com/youlookwhat/WebProgress/blob/master/library/src/main/java/me/jingbin/library/WebProgress.java)

 - xml文件引入：

 ```xml
 <me.jingbin.library.WebProgress
        android:id="@+id/progress"
        android:layout_width="match_parent"
        android:layout_height="2dp" />
 ```

- 显示处理：

 ```java
 mProgress.show(); // 显示
 mProgress.setWebProgress(50);  // 设置进度
 mProgress.setColor("#ff0000"); // 设置颜色
 mProgress.hide(); // 隐藏
 ```

## Thank
此类是从项目[Justson/AgentWeb-WebIndicator](https://github.com/Justson/AgentWeb/blob/master/agentweb-core/src/main/java/com/just/agentweb/WebIndicator.java)中将处理WebView进度条剥离出来的，在此基础上进行优化后合并为一个类，便于导入到自己的项目中。其中大部分代码出自原作者，感谢作者的开源精神。

优化处：

 * 1. 修复progress同时返回两次100时进度条出现两次
 * 2. 当一条进度没跑完，又点击其他链接开始第二次进度时，第二次进度不出现
 * 3. 修改消失动画时长，使其消失时可以看到进度跑完

## End
 - 有问题或更好的建议，欢迎提[Issues](https://github.com/youlookwhat/WebProgress/issues)，我会及时处理，谢谢。




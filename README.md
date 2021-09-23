## WebProgress  [![](https://jitpack.io/v/youlookwhat/WebProgress.svg)](https://jitpack.io/#youlookwhat/WebProgress)
An Android WebView progress bar display control, so that its loading progress smooth transition.

### Gif Preview

![demo](https://raw.githubusercontent.com/youlookwhat/WebProgress/master/image.gif)


GIF may have a point card to download a WebView project using this control for viewing：[网页浏览器](https://github.com/youlookwhat/ByWebView/raw/master/art/ByWebView-3.0.1.apk)

## Use
-  Add it in your root build.gradle at the end of repositories:
 
	```java
	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
	```

-  Add the dependency:
 
     ```java
		dependencies {
		    implementation 'com.github.youlookwhat:WebProgress:1.2.0'
		}
     ```

- Or just copy the class directly into the project：[WebProgress](https://github.com/youlookwhat/WebProgress/blob/master/library/src/main/java/me/jingbin/progress/WebProgress.java)

- xml：

	```xml
	 <me.jingbin.progress.WebProgress
	        android:id="@+id/progress"
	        android:layout_width="match_parent"
	        android:layout_height="2dp" 
	        android:visibility="gone" />
    ```

- code handle：

	```java
	 mProgress.show();                          // 显示
	 mProgress.setWebProgress(50);              // 设置进度
	 mProgress.setColor("#D81B60");             // 设置颜色
	 mProgress.setColor("#00D81B60","#D81B60"); // 设置渐变色
	 mProgress.hide();                          // 隐藏
   ```

### [in WebView](https://github.com/youlookwhat/ByWebView/blob/master/app/src/main/java/com/example/jingbin/webviewstudy/WebViewActivity.java)
 - show WebProgress：

	```java
	mWebView.loadUrl(mUrl);
	mProgress.show();
	```

 - onProgressChanged handle:

	```java
	@Override
    public void onProgressChanged(WebView view, int newProgress) {
        super.onProgressChanged(view, newProgress);
        mProgress.setWebProgress(newProgress);
    }
	```

 - onPageFinished handle:

	```java
	 @Override
    public void onPageFinished(WebView view, String url) {
        // html加载完成之后，无网隐藏进度条
        if (!CheckNetwork.isNetworkConnected(this)) {
            mProgress.hide();
        }
        super.onPageFinished(view, url);
    }
	```

## Thanks
此类是从项目[Justson/AgentWeb-WebIndicator](https://github.com/Justson/AgentWeb/blob/master/agentweb-core/src/main/java/com/just/agentweb/WebIndicator.java)中将处理WebView进度条剥离出来的，在此基础上进行优化后合并为一个类，便于导入到自己的项目中，感谢作者的开源精神。如果此项目帮助到你，请给一个Star，非常感谢！

优化处：

 * 1. 增加能显示进度渐变色
 * 2. 修复progress同时返回两次100时进度条出现两次
 * 3. [2019.9.29] 修复当第一次进度返回 0 或超过 10，出现不显示进度条的问题
 * 4. 修复当一条进度没跑完，又点击其他链接开始第二次进度时，第二次进度不出现的问题
 * 5. 修改消失动画时长，使其消失时可以看到进度跑完
 * 6. 修复进度在95-100时再次开始进度条透明度问题

## End
 - 有问题或更好的建议，欢迎提[Issues](https://github.com/youlookwhat/WebProgress/issues)，我会及时处理，谢谢。




# firefox_with_no_geckdriver
不需要geckdriver的最后一个firefox版本


>idea配置default reporters
>>run>edit configuretions>configuration>listeners>use default reporters


>或者加其他的
>>run>edit configuretions>configuration>listeners>org.uncommons.reportng.HTMLReporter
>>run>edit configuretions>configuration>listeners>org.uncommons.reportng.JUnitXMLReporter


>jenkins不显示样式解决方案：
>>使用这种方式启动：java  -jar jenkins.war -Dhudson.model.DirectoryBrowserSupport.CSP=

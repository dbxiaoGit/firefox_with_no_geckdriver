# firefox_with_no_geckdriver
不需要geckdriver的最后一个firefox版本


>idea配置default reporters
>>run>edit configuretions>configuration>listeners>use default reporters


>或者加其他的
>>run>edit configuretions>configuration>listeners>org.uncommons.reportng.HTMLReporter
>>run>edit configuretions>configuration>listeners>org.uncommons.reportng.JUnitXMLReporter


>jenkins不显示样式解决方案：
>>使用这种方式启动：java  -jar jenkins.war -Dhudson.model.DirectoryBrowserSupport.CSP=

>reportng报告乱码问题参考
>>http://blog.csdn.net/jack_chen3/article/details/77431805 >
>>要修改AbstractReporter中的generateFile方法中 >
>>//Writer writer = new BufferedWriter(new FileWriter(file));
>
>>//encoding to utf-8
>
>>OutputStream ut=new FileOutputStream(file);
>
>>Writer writer = new BufferedWriter(new OutputStreamWriter(out,"utf-8"));

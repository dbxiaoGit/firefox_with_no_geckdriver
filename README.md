说明
=
中标题
-
# 一级标题
## 二级标题
### 三级标题
#### 四级标题
##### 五级标题
###### 六级标题

三个下划线

___

三个*

***

三个减号

---

一二三换行<br>四五六

test`高亮文字`test
>一
>>二
>>>三
>>>>四
>>>>>五
* 一级点号
    * 二级点号
        * 三级点号

![baidu](http://www.baidu.com/img/bdlogo.gif "百度logo")
```Java
private final Logger logger = LoggerFactory.getLogger(getClass());
```
# firefox_with_no_geckdriver
不需要geckdriver的最后一个firefox版本


* idea配置default reporters
    * run>edit configuretions>configuration>listeners>use default reporters


* 或者加其他的
    * run>edit configuretions>configuration>listeners>org.uncommons.reportng.HTMLReporter
    * run>edit configuretions>configuration>listeners>org.uncommons.reportng.JUnitXMLReporter

* https://mobaxterm.mobatek.net/download-home-edition.html


* jenkins不显示样式解决方案：
    * 使用这种方式启动：java  -jar jenkins.war -Dhudson.model.DirectoryBrowserSupport.CSP=

* reportng报告乱码问题参考
    * http://blog.csdn.net/jack_chen3/article/details/77431805
    * 要修改AbstractReporter中的generateFile方法中
    * //Writer writer = new BufferedWriter(new FileWriter(file));
    * //encoding to utf-8
    * OutputStream ut=new FileOutputStream(file);
    * Writer writer = new BufferedWriter(new OutputStreamWriter(out,"utf-8"));
    
> #Auto add env parameter $PROMPT_COMMAND when use non-Linux tty login by ssh.        <br>
if [ "$SSH_CONNECTION" != '' -a "$TERM" != 'linux' ]; then        <br>
declare -a HOSTIP        <br>
HOSTIP=`echo $SSH_CONNECTION |awk '{print $3}'`        <br>
export PROMPT_COMMAND='echo -ne "\033]0;$HOSTIP\007"'        <br>
fi        <br>
export GREP_OPTIONS='--color=auto' GREP_COLOR='36'        <br>

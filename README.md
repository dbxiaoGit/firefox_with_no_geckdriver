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




MIIEpgIBAAKCAQEAyfbMarO9mWuPUdsTcA3Abawqe7KRKsJc0YpvLVf0R6dtB6O2
JLtuimB+yIB/Q079k2PE8CGUxiVVEtKtKJnGMZFjuSeE7s48hOXx9v1Scre+rvDy
CsYs7dRMm1oQEoB5kHxJFWJUnpoXNiuBc3bc4jgM3ReTcJD7tJBpBm4nmH1Avjhf
vLdc7XUFVn/4vBp6JTsjaSVbp1lb0QvKJDkNtJA+mo9J5zDBeuRGxphw6pRGg9lj
ITybv0yas557Dp4n9v1Brdy3R83WGVIav2WagoIgywNHwO1Xmj0BcHG4XcBdJ23c
zhSvWQ0HJNHxRrP94Dnkm7K97qOaKWdxZ96VHwIDAQABAoIBAQCbXnp5p5a3XRCf
hyqX7GxZsrXn/UJCI83mAVpwBpbNPNbapq3r6ikq2PsP4hKFRFI9PeZ2WU8rc/LT
jTFa55mZ7mBKQ0W3tP7HumH/gXgY+pP93yxE75oGyGi6pnlw0lcyuPo8Mi4o6R/s
M2Hd4tYgTcBPoeByG4cXrHSvVrStUGed9gRT9pfJ75+VcxKd1N92d1lEM6Xa4gXS
YN8z+dFcvUaH3SwM15zXGSYItyjCCAj5ef91yOYNS46qBdrr5F5BviAeBFg9JQv+
rcjCOCNB9oX4NbwD5fuakBQ1YPwTUfrVLWgTd+aVMid3n9BE8QUz9gjNEExrPbS6
x/IvQadxAoGBAPI6JLudzpyeo7PSgqW+Oa+ToNPB7ayXTIb2zkGRADublLLWfOrf
H3tRMmz6+jS05n6HKG7W3gPbCcaaTEenljeZeoHIOQuLi4Aj/NjjnAqa7/HFaa/S
hS6gwq52sLVTziG6EyAkka65nXHs9VUo3IyZU6pHSGLBdKbUPNDNz09HAoGBANVy
lgijVv+aa/snjXkryvYBoHynVGSBPJfl+Kb15VelrRB8IMWZmtgyl0DbcGgvruSn
JKDqo4IP1Exis2CPLwFw3BdzRJh34cstZYIz2X+a1BjWxn53/a8oq8/kyEKs7voB
gkuwqo/p5Vm/94BqBSaZmlk/QFTAIpYqWngbQudpAoGBAI/eQuUAVLAndRmgBaMF
ueNzrok3XMAu2PAsdNLymY3N2WLjDCzAO0WWM3oREzzs2R37juNOUW0+0q6YBIhm
nE0HpoCg+GjICCIivdHgVlTiM3OJCj24rwvDxf2zVz9LuFnF2Ag2UCTT8BSzZf+f
lmcXxl6TmgW122AfHMP0CZaPAoGBAMcjA5UFhworMOj9ysCsuctwUyFZH6Qw6q4w
sR5btV9jQ6ZomE6ic1OXR4QL9sBNFFdhFQxIPMoAKKonP4ErtMgcWkpKkUnKNs9P
CDBEXXvuoEiYQFIHcpdzU3A+2xNRshdvRveE2Gwx5HcqYSfeQfX0QotXNpabNulw
lD0P+ghZAoGBAO1dJsos8pi6TRTHTDwaKIFScHSDUZyvhBnn7seFCi85wUjmivsv
MTGosnIkORUCbrslH9NsBtooDES6HtX81xa10tYoaq8DtVfyL3/10Cnu+ssHOOoQ
3/ZxNRFpl1UlChJ+5h/hLqa8Si6ikdh3Elhtv7JDHe6MMkPLeVCcjerG

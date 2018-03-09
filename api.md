## 错误信息  

#### 当请求出错时，api将以如下格式返回错误信息，请在Ajax请求中以(success == 0)判断请求是否成功。  
+ Response 200

        {
            success: 0,
		    err_msg: '缺少必要参数'，
        }  
        
## 排行榜页 

#### 获取排行榜  `GET {base_url}/info/list`  
 
+ Request (application/json)

        {
		    tag： 0,  //0为综合，1为微博，2为微信，3为知乎
		    type:  1, //1为人物，2为文章
		    size:  10, //返回的是TOPx
		    period: 7, //最近x天内的排行
        }
+ Response 200

        {
            success: 1,
		    list:[{
		        //如果type为1
		        id: 1, //如果tag=0时该字段是用户表内的uid
		        name: 'xxx',
		        source: [1,2],  //1为微博，2为微信，3为知乎
		        no: 1,  //排名
		        score: 98.4, //得分
		    },{
		        //如果type为2
		        id: 1,
		        title: 'xxx',
		        time: '2017-6-10',
 		        author: 'xxx',
		        source: [1,2],  //1为微博，2为微信，3为知乎
		        no: 1,  //排名
		        score: 98.4, //得分
		    },
		    //...
		    ],
        }  

## 详情页 

#### 获取评分详情  `GET {base_url}/info/detail`  
 
+ Request (application/json)

        {
		    tag： 0,  //0为综合，1为微博，2为微信，3为知乎
		    type:  1, //1为人物，2为文章
		    id:  35,  //如果tag=0时该字段是用户表内的uid
		    period: 7, //最近x天内的排行
		    time: '2017-8-10', //当且仅当period=1时出现该字段，表示获取当日详情
        }
+ Response 200

        {
            success: 1,
		    score:  98.4, 
		    detail:[{
		        name: 'xxx', //类目1，如“微博转发数”
		        score: 14,  
		    },{
		        name: 'xxx', //类目2，如“微信点赞数”
		        score: 7.8,  
		    },
		    //...
		    ],
        }  

#### 获取一段时间内的评分  `GET {base_url}/info/period`  
 
+ Request (application/json)

        {
		    tag： 1,  //0为综合，1为微博，2为微信，3为知乎
		    type:  1, //1为人物，2为文章
		    id:  35,  //如果tag=0时该字段是用户表内的uid
		    period: 7, //x天内
		    start: '2017-8-10', //起始日期
        }
+ Response 200

        {
            success: 1,
		    detail:[{
		        time: '2017-8-10', 
		        score: 98,  
		    },{
		        time: '2017-8-11', 
		        score: 0,  
		    },
		    //...
		    ],
        }  

## 用户/控制台页 

#### 注册  `POST {base_url}/user/signup`  
 
+ Request (application/json)

        {
		    name： 'xxx', 
		    password:  'xxxxxxx', //md5(password)
        }
+ Response 200

        {
            success: 1,
        }  

#### 登录  `POST {base_url}/user/login`  
 
+ Request (application/json)

        {
		    name： 'xxx', 
		    password:  'xxxxxxx', //md5(password)
        }
+ Response 200

        {
            success: 1,
		    uid： 35, 
        }      
        
#### 获取绑定列表  `GET {base_url}/user/bind`  
 
+ Request (application/json)

        {
		    uid： 35, 
        }
+ Response 200

        {
            success: 1,
		    detail:[{
		        source: 1,   //1为微博，2为微信，3为知乎
		        name: 'xxx',  
		    },{
		        source: 2,   //1为微博，2为微信，3为知乎
		        name: 'xxx',  
		    },
		    //...
		    ],
        }      
 
#### 绑定新账号  `POST {base_url}/user/bind`  
 
+ Request (application/json)

        {
		    uid： 35, 
		    source： 3, 
		    name：'xxx', 
        }
+ Response 200

        {
            success: 1,
        }      
 

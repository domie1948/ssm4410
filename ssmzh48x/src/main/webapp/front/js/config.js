
var projectName = '大学生兼职信息系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '企业信息',
	url: './pages/qiyexinxi/list.html'
}, 
{
	name: '招聘信息',
	url: './pages/zhaopinxinxi/list.html'
}, 

{
	name: '兼职资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmzh48x/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"学生简历","menuJump":"列表","tableName":"xueshengjianli"}],"menu":"学生简历管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"企业","menuJump":"列表","tableName":"qiye"}],"menu":"企业管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"企业信息","menuJump":"列表","tableName":"qiyexinxi"}],"menu":"企业信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"学生应聘","menuJump":"列表","tableName":"xueshengyingpin"}],"menu":"学生应聘管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"兼职评价","menuJump":"列表","tableName":"jianzhipingjia"}],"menu":"兼职评价管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"兼职资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"企业信息列表","menuJump":"列表","tableName":"qiyexinxi"}],"menu":"企业信息模块"},{"child":[{"buttons":["查看","应聘"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生简历","menuJump":"列表","tableName":"xueshengjianli"}],"menu":"学生简历管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"学生应聘","menuJump":"列表","tableName":"xueshengyingpin"}],"menu":"学生应聘管理"},{"child":[{"buttons":["查看","审核"],"menu":"兼职评价","menuJump":"列表","tableName":"jianzhipingjia"}],"menu":"兼职评价管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"企业信息列表","menuJump":"列表","tableName":"qiyexinxi"}],"menu":"企业信息模块"},{"child":[{"buttons":["查看","应聘"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["查看","导出"],"menu":"学生简历","menuJump":"列表","tableName":"xueshengjianli"}],"menu":"学生简历管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"企业信息","menuJump":"列表","tableName":"qiyexinxi"}],"menu":"企业信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["查看","审核","反馈","评价"],"menu":"学生应聘","menuJump":"列表","tableName":"xueshengyingpin"}],"menu":"学生应聘管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"兼职评价","menuJump":"列表","tableName":"jianzhipingjia"}],"menu":"兼职评价管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"企业信息列表","menuJump":"列表","tableName":"qiyexinxi"}],"menu":"企业信息模块"},{"child":[{"buttons":["查看","应聘"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"企业","tableName":"qiye"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

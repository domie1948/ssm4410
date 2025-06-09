import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import qiyexinxi from '@/views/modules/qiyexinxi/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import storeup from '@/views/modules/storeup/list'
    import xueshengjianli from '@/views/modules/xueshengjianli/list'
    import qiye from '@/views/modules/qiye/list'
    import discusszhaopinxinxi from '@/views/modules/discusszhaopinxinxi/list'
    import zhaopinxinxi from '@/views/modules/zhaopinxinxi/list'
    import discussqiyexinxi from '@/views/modules/discussqiyexinxi/list'
    import jianzhipingjia from '@/views/modules/jianzhipingjia/list'
    import messages from '@/views/modules/messages/list'
    import xueshengyingpin from '@/views/modules/xueshengyingpin/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '兼职资讯',
        component: news
      }
          ,{
	path: '/qiyexinxi',
        name: '企业信息',
        component: qiyexinxi
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/xueshengjianli',
        name: '学生简历',
        component: xueshengjianli
      }
          ,{
	path: '/qiye',
        name: '企业',
        component: qiye
      }
          ,{
	path: '/discusszhaopinxinxi',
        name: '招聘信息评论',
        component: discusszhaopinxinxi
      }
          ,{
	path: '/zhaopinxinxi',
        name: '招聘信息',
        component: zhaopinxinxi
      }
          ,{
	path: '/discussqiyexinxi',
        name: '企业信息评论',
        component: discussqiyexinxi
      }
          ,{
	path: '/jianzhipingjia',
        name: '兼职评价',
        component: jianzhipingjia
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/xueshengyingpin',
        name: '学生应聘',
        component: xueshengyingpin
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

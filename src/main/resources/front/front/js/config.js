
var projectName = '大学生一体化服务平台';
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
]


var indexNav = [

{
	name: '服务信息',
	url: './pages/fuwuxinxi/list.html'
}, 
{
	name: '组队拼车',
	url: './pages/zuduipinche/list.html'
}, 
{
	name: '闲置交易',
	url: './pages/xianzhijiaoyi/list.html'
}, 
{
	name: '兼职信息',
	url: './pages/jianzhixinxi/list.html'
}, 

]

var adminurl =  "http://localhost:8080/springbootsb00r/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除"],"menu":"司机","menuJump":"列表","tableName":"siji"}],"menu":"司机管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除"],"menu":"商家","menuJump":"列表","tableName":"shangjia"}],"menu":"商家管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","删除"],"menu":"服务信息","menuJump":"列表","tableName":"fuwuxinxi"}],"menu":"服务信息管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","删除"],"menu":"服务接单","menuJump":"列表","tableName":"fuwujiedan"}],"menu":"服务接单管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","删除"],"menu":"组队拼车","menuJump":"列表","tableName":"zuduipinche"}],"menu":"组队拼车管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","删除"],"menu":"拼车信息","menuJump":"列表","tableName":"pinchexinxi"}],"menu":"拼车信息管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"服务类型","menuJump":"列表","tableName":"fuwuleixing"}],"menu":"服务类型管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除"],"menu":"闲置交易","menuJump":"列表","tableName":"xianzhijiaoyi"}],"menu":"闲置交易管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除"],"menu":"兼职信息","menuJump":"列表","tableName":"jianzhixinxi"}],"menu":"兼职信息管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","删除"],"menu":"兼职应聘","menuJump":"列表","tableName":"jianzhiyingpin"}],"menu":"兼职应聘管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","接单"],"menu":"服务信息列表","menuJump":"列表","tableName":"fuwuxinxi"}],"menu":"服务信息模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","拼车"],"menu":"组队拼车列表","menuJump":"列表","tableName":"zuduipinche"}],"menu":"组队拼车模块"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看"],"menu":"闲置交易列表","menuJump":"列表","tableName":"xianzhijiaoyi"}],"menu":"闲置交易模块"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","应聘"],"menu":"兼职信息列表","menuJump":"列表","tableName":"jianzhixinxi"}],"menu":"兼职信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除"],"menu":"服务信息","menuJump":"列表","tableName":"fuwuxinxi"}],"menu":"服务信息管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","支付","删除"],"menu":"服务接单","menuJump":"列表","tableName":"fuwujiedan"}],"menu":"服务接单管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","支付"],"menu":"拼车信息","menuJump":"列表","tableName":"pinchexinxi"}],"menu":"拼车信息管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"闲置交易","menuJump":"列表","tableName":"xianzhijiaoyi"}],"menu":"闲置交易管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"兼职应聘","menuJump":"列表","tableName":"jianzhiyingpin"}],"menu":"兼职应聘管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","接单"],"menu":"服务信息列表","menuJump":"列表","tableName":"fuwuxinxi"}],"menu":"服务信息模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","拼车"],"menu":"组队拼车列表","menuJump":"列表","tableName":"zuduipinche"}],"menu":"组队拼车模块"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看"],"menu":"闲置交易列表","menuJump":"列表","tableName":"xianzhijiaoyi"}],"menu":"闲置交易模块"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","应聘"],"menu":"兼职信息列表","menuJump":"列表","tableName":"jianzhixinxi"}],"menu":"兼职信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除"],"menu":"组队拼车","menuJump":"列表","tableName":"zuduipinche"}],"menu":"组队拼车管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"拼车信息","menuJump":"列表","tableName":"pinchexinxi"}],"menu":"拼车信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","接单"],"menu":"服务信息列表","menuJump":"列表","tableName":"fuwuxinxi"}],"menu":"服务信息模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","拼车"],"menu":"组队拼车列表","menuJump":"列表","tableName":"zuduipinche"}],"menu":"组队拼车模块"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看"],"menu":"闲置交易列表","menuJump":"列表","tableName":"xianzhijiaoyi"}],"menu":"闲置交易模块"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","应聘"],"menu":"兼职信息列表","menuJump":"列表","tableName":"jianzhixinxi"}],"menu":"兼职信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"司机","tableName":"siji"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除"],"menu":"兼职信息","menuJump":"列表","tableName":"jianzhixinxi"}],"menu":"兼职信息管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","审核"],"menu":"兼职应聘","menuJump":"列表","tableName":"jianzhiyingpin"}],"menu":"兼职应聘管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","接单"],"menu":"服务信息列表","menuJump":"列表","tableName":"fuwuxinxi"}],"menu":"服务信息模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","拼车"],"menu":"组队拼车列表","menuJump":"列表","tableName":"zuduipinche"}],"menu":"组队拼车模块"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看"],"menu":"闲置交易列表","menuJump":"列表","tableName":"xianzhijiaoyi"}],"menu":"闲置交易模块"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","应聘"],"menu":"兼职信息列表","menuJump":"列表","tableName":"jianzhixinxi"}],"menu":"兼职信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"商家","tableName":"shangjia"}]


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

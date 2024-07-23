const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootsb00r/",
            name: "springbootsb00r",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootsb00r/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "大学生一体化服务平台"
        } 
    }
}
export default base

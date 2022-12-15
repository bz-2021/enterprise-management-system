<template>
    <div>
        <div class="context-title">考勤</div>
        <div class="context">
            <div class="context-nav">
                <span>员工ID</span>
                <span>姓名</span>
                <span>级别</span>
                <span>职位</span>
                <span>性别</span>
                <span>文化程度</span>
                <span>照片</span>
                <span>政治面貌</span>
                <span>民族</span>
                <div>操作</div>

            </div>
            <ul>
                <li class="item" v-for="(item, index) in userlist">
                    <div>{{ item.id }}</div>
                    <div>{{ item.name }}</div>
                    <div>{{ item.level }}</div>
                    <div>{{ item.status }}</div>
                    <div>{{ item.gender }}</div>
                    <div>{{ item.education }}</div>
                    <div>{{ item.photo }}</div>
                    <div>{{ item.politicalFace }}</div>
                    <div>{{ item.ethnicity }}</div>
                    <div class="operation">
                        <el-button type="text" @click="showDetail(item.id)">查看考勤信息</el-button>
                        <el-button type="text" @click="dialogVisible = true, nowEmployeeid = item.id">更新考勤</el-button>
                    </div>
                </li>
            </ul>
        </div>
        <el-dialog title="提示" :visible.sync="dialogVisible" width="30%" :before-close="handleClose">
            <el-tag>缺勤</el-tag>
            <el-tag type="success">正常出勤</el-tag>
            <el-tag type="info">迟到</el-tag>
            <el-tag type="warning">早退</el-tag>
            <el-tag type="danger">加班</el-tag>
            <el-input v-model="input" placeholder="请更新考勤信息"></el-input>
            <span slot="footer" class="dialog-footer">
                <el-button @click="dialogVisible = false">取 消</el-button>
                <el-button type="primary" @click="updateAttendance">确 定</el-button>
            </span>
        </el-dialog>
    </div>

</template>

<script>
import { mapState } from 'vuex';
export default {
    inject: ['reload'],
    data() {
        return {
            dialogVisible: false,
            nowEmployeeid: '',
            user: '',
            myname: '', level: '', status: '', gender: '', photo: '',
            ethnicity: '', birthday: '', politicalFace: '',
            education: '', id_card: '', phone_number: '',
            e_mail: '', username: '', account: '', did: '', password: '', input: ''
        }
    },
    methods: {
        handleClose(done) {
            this.$confirm('确认关闭？')
                .then(_ => {
                    done();
                })
                .catch(_ => { });
        },
        showDetail(id) {
            this.$store.dispatch('getAttendance', id).then(res => {

                this.$alert(`<strong>缺勤:${this.attendance.absence}次 出席:${this.attendance.attendance}次  迟到:${this.attendance.late}次 早退:${this.attendance.leave_early}次 加班:${this.attendance.overtime}次</strong>`, '考勤信息', {
                    dangerouslyUseHTMLString: true
                });
            })
        },
        updateAttendance() {
            this.dialogVisible = false

            var data = {
                "id": this.nowEmployeeid,
                "status": this.input
            }
            this.$store.dispatch('updateAttendance', data).then(res => {
                alert(res)
            })
        }
    },
    computed: {
        ...mapState({
            userlist: (state) => state.userlist,
            attendance: (state) => state.attendance
        })
    },
    mounted: function () {
        this.$store.dispatch('getList')

    }

}
</script>

<style scoped>
a {
    text-decoration: none;
    /* color: #000; */
}

li {
    list-style-type: none;
}

.context {
    border: 2px solid pink;
    border-top: 1px solid pink;
    position: absolute;
    top: 210px;
    left: 245px;
    height: 500px;
    width: 1057px;
}

.context-title {
    background-color: rgb(68, 81, 97);
    height: 30px;
    color: rgb(255, 255, 255);
    width: 120px;
    position: absolute;
    left: 245px;
    top: 180px;
    text-align: center;
    line-height: 30px;
}

.context-add {
    background-color: rgb(68, 81, 97);
    height: 30px;
    color: rgb(255, 255, 255);
    width: 120px;
    position: absolute;
    left: 1182px;
    top: 180px;
    text-align: center;
    line-height: 30px;
}

.context-add a {
    color: white;
}

.context-detail {
    text-align: center;
    line-height: 246px;
    height: 246px;
    width: 840px;
}

.context-nav {
    background-color: rgb(237, 234, 235);
    height: 30px;
    line-height: 30px;
}

.context-nav>span {
    display: block;
    float: left;
    text-align: center;
    width: 96px;
}

.context-nav div {
    float: right;
    width: 120px;
}


.item {
    display: block;
    height: 41px;
}

.item>div {
    height: 41px;
    float: left;
    border-bottom: 1px solid pink;
    text-align: center;
    line-height: 41px;
    width: 96px;
}

.item :nth-child(10) {
    width: 180px;
}

.operation {
    width: 120px;
}
</style>
import './App.css';
import { ConfigProvider } from 'antd';
//import { Provider } from "react-redux"; //是一个使用叫做“action”的事件来管理和更新应用状态的模式和工具 它以集中式Store（centralized store）的方式对整个应用中使用的状态进行集中管理
import zhCN from "antd/es/locale/zh_CN"; //默认中文
import Router from "@/router/router";
function App() {
  return (
    //<!-- //使用context特性进行向下传播-->
    <ConfigProvider locale={zhCN}>
      <Router/>
  </ConfigProvider>
  );
}

export default App;

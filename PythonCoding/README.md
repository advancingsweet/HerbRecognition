## AI中药材识别

### 文件目录

```bash
work_med
├─ data_read.py # 数据读取
├─ data_split.py # 数据切分
├─ images  # 图片文件
├─ models # 模型
├─ window.py # UI界面
├─ test_model.py # 模型测试
├─ train_model.py # 模型训练
└─ README.md 
```

### 使用

需求安装：tensorflow-cpu == 2.3.0、pyqt5、pillow、opencv-python、matplotlib

训练模型：

```
python train_model.py
```

测试模型的准确率：

```
python test_model.py
```

图形化的界面：

```
python window.py
```


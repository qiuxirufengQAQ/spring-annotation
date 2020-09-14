package com.colson.condition;

import com.colson.bean.Blue;
import com.colson.bean.Red;
import com.colson.bean.Yellow;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

// 自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
//        importingClassMetadata.getAnnotationTypes();
        return new String[]{Blue.class.getName(), Red.class.getName(), Yellow.class.getName()};
    }
}

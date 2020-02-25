package com.jiangtj.example.junit5.extend;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.util.AnnotationUtils;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2020/2/25 18:11 End.
 */
public class PassConditionalExtension implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        return AnnotationUtils.findAnnotation(context.getElement(), Pass.class)
                .map(Pass::value)
                .filter("我很帅"::equals)
                .map(item -> ConditionEvaluationResult.enabled("pass"))
                .orElse(ConditionEvaluationResult.disabled("pass is not okay!"));
    }
}

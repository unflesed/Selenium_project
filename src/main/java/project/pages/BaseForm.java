package project.pages;

import framework.webElements.BaseElement;

public abstract class BaseForm {
    private BaseElement uniqueElement;
    public BaseForm() {
    }

    public BaseForm(BaseElement uniqueElement) {
        this.uniqueElement = uniqueElement;
    }

    public boolean isOpened() throws Exception {
        return uniqueElement.isDisplayed();
    }
}

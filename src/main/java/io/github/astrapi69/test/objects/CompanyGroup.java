package io.github.astrapi69.test.objects;

import java.util.Set;

public class CompanyGroup {
    private Factory parent;
    private Set<Company> children;

    public CompanyGroup(Factory parent, Set<Company> children) {
        this.parent = parent;
        this.children = children;
    }

    public CompanyGroup() {
    }

    protected CompanyGroup(CompanyGroupBuilder<?, ?> b) {
        this.parent = b.parent;
        this.children = b.children;
    }

    public static CompanyGroupBuilder<?, ?> builder() {
        return new CompanyGroupBuilderImpl();
    }

    public Factory getParent() {
        return this.parent;
    }

    public Set<Company> getChildren() {
        return this.children;
    }

    public void setParent(Factory parent) {
        this.parent = parent;
    }

    public void setChildren(Set<Company> children) {
        this.children = children;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CompanyGroup)) return false;
        final CompanyGroup other = (CompanyGroup) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$parent = this.getParent();
        final Object other$parent = other.getParent();
        if (this$parent == null ? other$parent != null : !this$parent.equals(other$parent)) return false;
        final Object this$children = this.getChildren();
        final Object other$children = other.getChildren();
        if (this$children == null ? other$children != null : !this$children.equals(other$children)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CompanyGroup;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $parent = this.getParent();
        result = result * PRIME + ($parent == null ? 43 : $parent.hashCode());
        final Object $children = this.getChildren();
        result = result * PRIME + ($children == null ? 43 : $children.hashCode());
        return result;
    }

    public String toString() {
        return "CompanyGroup(parent=" + this.getParent() + ", children=" + this.getChildren() + ")";
    }

    public CompanyGroupBuilder<?, ?> toBuilder() {
        return new CompanyGroupBuilderImpl().$fillValuesFrom(this);
    }

    public static abstract class CompanyGroupBuilder<C extends CompanyGroup, B extends CompanyGroupBuilder<C, B>> {
        private Factory parent;
        private Set<Company> children;

        private static void $fillValuesFromInstanceIntoBuilder(CompanyGroup instance, CompanyGroupBuilder<?, ?> b) {
            b.parent(instance.parent);
            b.children(instance.children);
        }

        public B parent(Factory parent) {
            this.parent = parent;
            return self();
        }

        public B children(Set<Company> children) {
            this.children = children;
            return self();
        }

        protected B $fillValuesFrom(C instance) {
            CompanyGroupBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
            return self();
        }

        protected abstract B self();

        public abstract C build();

        public String toString() {
            return "CompanyGroup.CompanyGroupBuilder(parent=" + this.parent + ", children=" + this.children + ")";
        }
    }

    private static final class CompanyGroupBuilderImpl extends CompanyGroupBuilder<CompanyGroup, CompanyGroupBuilderImpl> {
        private CompanyGroupBuilderImpl() {
        }

        protected CompanyGroupBuilderImpl self() {
            return this;
        }

        public CompanyGroup build() {
            return new CompanyGroup(this);
        }
    }
}

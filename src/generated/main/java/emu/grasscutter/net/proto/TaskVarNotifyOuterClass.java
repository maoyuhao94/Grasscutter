// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TaskVarNotify.proto

public final class TaskVarNotifyOuterClass {
  private TaskVarNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TaskVarNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TaskVarNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .TaskVar taskVarList = 9;</code>
     */
    java.util.List<TaskVarOuterClass.TaskVar> 
        getTaskVarListList();
    /**
     * <code>repeated .TaskVar taskVarList = 9;</code>
     */
    TaskVarOuterClass.TaskVar getTaskVarList(int index);
    /**
     * <code>repeated .TaskVar taskVarList = 9;</code>
     */
    int getTaskVarListCount();
    /**
     * <code>repeated .TaskVar taskVarList = 9;</code>
     */
    java.util.List<? extends TaskVarOuterClass.TaskVarOrBuilder> 
        getTaskVarListOrBuilderList();
    /**
     * <code>repeated .TaskVar taskVarList = 9;</code>
     */
    TaskVarOuterClass.TaskVarOrBuilder getTaskVarListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code TaskVarNotify}
   */
  public static final class TaskVarNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TaskVarNotify)
      TaskVarNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TaskVarNotify.newBuilder() to construct.
    private TaskVarNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TaskVarNotify() {
      taskVarList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TaskVarNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TaskVarNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 74: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                taskVarList_ = new java.util.ArrayList<TaskVarOuterClass.TaskVar>();
                mutable_bitField0_ |= 0x00000001;
              }
              taskVarList_.add(
                  input.readMessage(TaskVarOuterClass.TaskVar.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          taskVarList_ = java.util.Collections.unmodifiableList(taskVarList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TaskVarNotifyOuterClass.internal_static_TaskVarNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TaskVarNotifyOuterClass.internal_static_TaskVarNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TaskVarNotifyOuterClass.TaskVarNotify.class, TaskVarNotifyOuterClass.TaskVarNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code TaskVarNotify.JGAIGHMHFAH}
     */
    public enum JGAIGHMHFAH
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 177;</code>
       */
      PEPPOHPHJOJ(1, 177),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final JGAIGHMHFAH DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 177;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 177;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static JGAIGHMHFAH valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static JGAIGHMHFAH forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 177: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<JGAIGHMHFAH>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          JGAIGHMHFAH> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<JGAIGHMHFAH>() {
              public JGAIGHMHFAH findValueByNumber(int number) {
                return JGAIGHMHFAH.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return TaskVarNotifyOuterClass.TaskVarNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final JGAIGHMHFAH[] VALUES = getStaticValuesArray();
      private static JGAIGHMHFAH[] getStaticValuesArray() {
        return new JGAIGHMHFAH[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static JGAIGHMHFAH valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private JGAIGHMHFAH(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:TaskVarNotify.JGAIGHMHFAH)
    }

    public static final int TASKVARLIST_FIELD_NUMBER = 9;
    private java.util.List<TaskVarOuterClass.TaskVar> taskVarList_;
    /**
     * <code>repeated .TaskVar taskVarList = 9;</code>
     */
    @java.lang.Override
    public java.util.List<TaskVarOuterClass.TaskVar> getTaskVarListList() {
      return taskVarList_;
    }
    /**
     * <code>repeated .TaskVar taskVarList = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends TaskVarOuterClass.TaskVarOrBuilder> 
        getTaskVarListOrBuilderList() {
      return taskVarList_;
    }
    /**
     * <code>repeated .TaskVar taskVarList = 9;</code>
     */
    @java.lang.Override
    public int getTaskVarListCount() {
      return taskVarList_.size();
    }
    /**
     * <code>repeated .TaskVar taskVarList = 9;</code>
     */
    @java.lang.Override
    public TaskVarOuterClass.TaskVar getTaskVarList(int index) {
      return taskVarList_.get(index);
    }
    /**
     * <code>repeated .TaskVar taskVarList = 9;</code>
     */
    @java.lang.Override
    public TaskVarOuterClass.TaskVarOrBuilder getTaskVarListOrBuilder(
        int index) {
      return taskVarList_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < taskVarList_.size(); i++) {
        output.writeMessage(9, taskVarList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < taskVarList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, taskVarList_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof TaskVarNotifyOuterClass.TaskVarNotify)) {
        return super.equals(obj);
      }
      TaskVarNotifyOuterClass.TaskVarNotify other = (TaskVarNotifyOuterClass.TaskVarNotify) obj;

      if (!getTaskVarListList()
          .equals(other.getTaskVarListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getTaskVarListCount() > 0) {
        hash = (37 * hash) + TASKVARLIST_FIELD_NUMBER;
        hash = (53 * hash) + getTaskVarListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static TaskVarNotifyOuterClass.TaskVarNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TaskVarNotifyOuterClass.TaskVarNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TaskVarNotifyOuterClass.TaskVarNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TaskVarNotifyOuterClass.TaskVarNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TaskVarNotifyOuterClass.TaskVarNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TaskVarNotifyOuterClass.TaskVarNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TaskVarNotifyOuterClass.TaskVarNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TaskVarNotifyOuterClass.TaskVarNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static TaskVarNotifyOuterClass.TaskVarNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static TaskVarNotifyOuterClass.TaskVarNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static TaskVarNotifyOuterClass.TaskVarNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TaskVarNotifyOuterClass.TaskVarNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(TaskVarNotifyOuterClass.TaskVarNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TaskVarNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TaskVarNotify)
        TaskVarNotifyOuterClass.TaskVarNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TaskVarNotifyOuterClass.internal_static_TaskVarNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TaskVarNotifyOuterClass.internal_static_TaskVarNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TaskVarNotifyOuterClass.TaskVarNotify.class, TaskVarNotifyOuterClass.TaskVarNotify.Builder.class);
      }

      // Construct using TaskVarNotifyOuterClass.TaskVarNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getTaskVarListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (taskVarListBuilder_ == null) {
          taskVarList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          taskVarListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TaskVarNotifyOuterClass.internal_static_TaskVarNotify_descriptor;
      }

      @java.lang.Override
      public TaskVarNotifyOuterClass.TaskVarNotify getDefaultInstanceForType() {
        return TaskVarNotifyOuterClass.TaskVarNotify.getDefaultInstance();
      }

      @java.lang.Override
      public TaskVarNotifyOuterClass.TaskVarNotify build() {
        TaskVarNotifyOuterClass.TaskVarNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public TaskVarNotifyOuterClass.TaskVarNotify buildPartial() {
        TaskVarNotifyOuterClass.TaskVarNotify result = new TaskVarNotifyOuterClass.TaskVarNotify(this);
        int from_bitField0_ = bitField0_;
        if (taskVarListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            taskVarList_ = java.util.Collections.unmodifiableList(taskVarList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.taskVarList_ = taskVarList_;
        } else {
          result.taskVarList_ = taskVarListBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TaskVarNotifyOuterClass.TaskVarNotify) {
          return mergeFrom((TaskVarNotifyOuterClass.TaskVarNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TaskVarNotifyOuterClass.TaskVarNotify other) {
        if (other == TaskVarNotifyOuterClass.TaskVarNotify.getDefaultInstance()) return this;
        if (taskVarListBuilder_ == null) {
          if (!other.taskVarList_.isEmpty()) {
            if (taskVarList_.isEmpty()) {
              taskVarList_ = other.taskVarList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTaskVarListIsMutable();
              taskVarList_.addAll(other.taskVarList_);
            }
            onChanged();
          }
        } else {
          if (!other.taskVarList_.isEmpty()) {
            if (taskVarListBuilder_.isEmpty()) {
              taskVarListBuilder_.dispose();
              taskVarListBuilder_ = null;
              taskVarList_ = other.taskVarList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              taskVarListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTaskVarListFieldBuilder() : null;
            } else {
              taskVarListBuilder_.addAllMessages(other.taskVarList_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        TaskVarNotifyOuterClass.TaskVarNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (TaskVarNotifyOuterClass.TaskVarNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<TaskVarOuterClass.TaskVar> taskVarList_ =
        java.util.Collections.emptyList();
      private void ensureTaskVarListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          taskVarList_ = new java.util.ArrayList<TaskVarOuterClass.TaskVar>(taskVarList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          TaskVarOuterClass.TaskVar, TaskVarOuterClass.TaskVar.Builder, TaskVarOuterClass.TaskVarOrBuilder> taskVarListBuilder_;

      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public java.util.List<TaskVarOuterClass.TaskVar> getTaskVarListList() {
        if (taskVarListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(taskVarList_);
        } else {
          return taskVarListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public int getTaskVarListCount() {
        if (taskVarListBuilder_ == null) {
          return taskVarList_.size();
        } else {
          return taskVarListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public TaskVarOuterClass.TaskVar getTaskVarList(int index) {
        if (taskVarListBuilder_ == null) {
          return taskVarList_.get(index);
        } else {
          return taskVarListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public Builder setTaskVarList(
          int index, TaskVarOuterClass.TaskVar value) {
        if (taskVarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTaskVarListIsMutable();
          taskVarList_.set(index, value);
          onChanged();
        } else {
          taskVarListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public Builder setTaskVarList(
          int index, TaskVarOuterClass.TaskVar.Builder builderForValue) {
        if (taskVarListBuilder_ == null) {
          ensureTaskVarListIsMutable();
          taskVarList_.set(index, builderForValue.build());
          onChanged();
        } else {
          taskVarListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public Builder addTaskVarList(TaskVarOuterClass.TaskVar value) {
        if (taskVarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTaskVarListIsMutable();
          taskVarList_.add(value);
          onChanged();
        } else {
          taskVarListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public Builder addTaskVarList(
          int index, TaskVarOuterClass.TaskVar value) {
        if (taskVarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTaskVarListIsMutable();
          taskVarList_.add(index, value);
          onChanged();
        } else {
          taskVarListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public Builder addTaskVarList(
          TaskVarOuterClass.TaskVar.Builder builderForValue) {
        if (taskVarListBuilder_ == null) {
          ensureTaskVarListIsMutable();
          taskVarList_.add(builderForValue.build());
          onChanged();
        } else {
          taskVarListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public Builder addTaskVarList(
          int index, TaskVarOuterClass.TaskVar.Builder builderForValue) {
        if (taskVarListBuilder_ == null) {
          ensureTaskVarListIsMutable();
          taskVarList_.add(index, builderForValue.build());
          onChanged();
        } else {
          taskVarListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public Builder addAllTaskVarList(
          java.lang.Iterable<? extends TaskVarOuterClass.TaskVar> values) {
        if (taskVarListBuilder_ == null) {
          ensureTaskVarListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, taskVarList_);
          onChanged();
        } else {
          taskVarListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public Builder clearTaskVarList() {
        if (taskVarListBuilder_ == null) {
          taskVarList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          taskVarListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public Builder removeTaskVarList(int index) {
        if (taskVarListBuilder_ == null) {
          ensureTaskVarListIsMutable();
          taskVarList_.remove(index);
          onChanged();
        } else {
          taskVarListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public TaskVarOuterClass.TaskVar.Builder getTaskVarListBuilder(
          int index) {
        return getTaskVarListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public TaskVarOuterClass.TaskVarOrBuilder getTaskVarListOrBuilder(
          int index) {
        if (taskVarListBuilder_ == null) {
          return taskVarList_.get(index);  } else {
          return taskVarListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public java.util.List<? extends TaskVarOuterClass.TaskVarOrBuilder> 
           getTaskVarListOrBuilderList() {
        if (taskVarListBuilder_ != null) {
          return taskVarListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(taskVarList_);
        }
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public TaskVarOuterClass.TaskVar.Builder addTaskVarListBuilder() {
        return getTaskVarListFieldBuilder().addBuilder(
            TaskVarOuterClass.TaskVar.getDefaultInstance());
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public TaskVarOuterClass.TaskVar.Builder addTaskVarListBuilder(
          int index) {
        return getTaskVarListFieldBuilder().addBuilder(
            index, TaskVarOuterClass.TaskVar.getDefaultInstance());
      }
      /**
       * <code>repeated .TaskVar taskVarList = 9;</code>
       */
      public java.util.List<TaskVarOuterClass.TaskVar.Builder> 
           getTaskVarListBuilderList() {
        return getTaskVarListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          TaskVarOuterClass.TaskVar, TaskVarOuterClass.TaskVar.Builder, TaskVarOuterClass.TaskVarOrBuilder> 
          getTaskVarListFieldBuilder() {
        if (taskVarListBuilder_ == null) {
          taskVarListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              TaskVarOuterClass.TaskVar, TaskVarOuterClass.TaskVar.Builder, TaskVarOuterClass.TaskVarOrBuilder>(
                  taskVarList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          taskVarList_ = null;
        }
        return taskVarListBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TaskVarNotify)
    }

    // @@protoc_insertion_point(class_scope:TaskVarNotify)
    private static final TaskVarNotifyOuterClass.TaskVarNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TaskVarNotifyOuterClass.TaskVarNotify();
    }

    public static TaskVarNotifyOuterClass.TaskVarNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TaskVarNotify>
        PARSER = new com.google.protobuf.AbstractParser<TaskVarNotify>() {
      @java.lang.Override
      public TaskVarNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TaskVarNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TaskVarNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TaskVarNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public TaskVarNotifyOuterClass.TaskVarNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TaskVarNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TaskVarNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023TaskVarNotify.proto\032\rTaskVar.proto\"\177\n\r" +
      "TaskVarNotify\022\035\n\013taskVarList\030\t \003(\0132\010.Tas" +
      "kVar\"O\n\013JGAIGHMHFAH\022\010\n\004NONE\020\000\022\020\n\013PEPPOHP" +
      "HJOJ\020\261\001\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020" +
      "\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          TaskVarOuterClass.getDescriptor(),
        });
    internal_static_TaskVarNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TaskVarNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TaskVarNotify_descriptor,
        new java.lang.String[] { "TaskVarList", });
    TaskVarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

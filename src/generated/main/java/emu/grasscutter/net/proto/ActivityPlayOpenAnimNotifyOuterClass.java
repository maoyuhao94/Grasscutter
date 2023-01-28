// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityPlayOpenAnimNotify.proto

public final class ActivityPlayOpenAnimNotifyOuterClass {
  private ActivityPlayOpenAnimNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityPlayOpenAnimNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityPlayOpenAnimNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 activityId = 15;</code>
     * @return The activityId.
     */
    int getActivityId();
  }
  /**
   * Protobuf type {@code ActivityPlayOpenAnimNotify}
   */
  public static final class ActivityPlayOpenAnimNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityPlayOpenAnimNotify)
      ActivityPlayOpenAnimNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityPlayOpenAnimNotify.newBuilder() to construct.
    private ActivityPlayOpenAnimNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityPlayOpenAnimNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityPlayOpenAnimNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityPlayOpenAnimNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 120: {

              activityId_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ActivityPlayOpenAnimNotifyOuterClass.internal_static_ActivityPlayOpenAnimNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ActivityPlayOpenAnimNotifyOuterClass.internal_static_ActivityPlayOpenAnimNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.class, ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code ActivityPlayOpenAnimNotify.BOFOPFKDLEN}
     */
    public enum BOFOPFKDLEN
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 2178;</code>
       */
      PEPPOHPHJOJ(1, 2178),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final BOFOPFKDLEN DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final BOFOPFKDLEN EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 2178;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 2178;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static BOFOPFKDLEN valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static BOFOPFKDLEN forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 2178: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BOFOPFKDLEN>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BOFOPFKDLEN> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BOFOPFKDLEN>() {
              public BOFOPFKDLEN findValueByNumber(int number) {
                return BOFOPFKDLEN.forNumber(number);
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
        return ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final BOFOPFKDLEN[] VALUES = getStaticValuesArray();
      private static BOFOPFKDLEN[] getStaticValuesArray() {
        return new BOFOPFKDLEN[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static BOFOPFKDLEN valueOf(
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

      private BOFOPFKDLEN(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ActivityPlayOpenAnimNotify.BOFOPFKDLEN)
    }

    public static final int ACTIVITYID_FIELD_NUMBER = 15;
    private int activityId_;
    /**
     * <code>uint32 activityId = 15;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
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
      if (activityId_ != 0) {
        output.writeUInt32(15, activityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, activityId_);
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
      if (!(obj instanceof ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify)) {
        return super.equals(obj);
      }
      ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify other = (ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify) obj;

      if (getActivityId()
          != other.getActivityId()) return false;
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
      hash = (37 * hash) + ACTIVITYID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
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
    public static Builder newBuilder(ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify prototype) {
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
     * Protobuf type {@code ActivityPlayOpenAnimNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityPlayOpenAnimNotify)
        ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ActivityPlayOpenAnimNotifyOuterClass.internal_static_ActivityPlayOpenAnimNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ActivityPlayOpenAnimNotifyOuterClass.internal_static_ActivityPlayOpenAnimNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.class, ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.Builder.class);
      }

      // Construct using ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        activityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ActivityPlayOpenAnimNotifyOuterClass.internal_static_ActivityPlayOpenAnimNotify_descriptor;
      }

      @java.lang.Override
      public ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify getDefaultInstanceForType() {
        return ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.getDefaultInstance();
      }

      @java.lang.Override
      public ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify build() {
        ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify buildPartial() {
        ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify result = new ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify(this);
        result.activityId_ = activityId_;
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
        if (other instanceof ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify) {
          return mergeFrom((ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify other) {
        if (other == ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.getDefaultInstance()) return this;
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
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
        ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activityId = 15;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activityId = 15;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activityId = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:ActivityPlayOpenAnimNotify)
    }

    // @@protoc_insertion_point(class_scope:ActivityPlayOpenAnimNotify)
    private static final ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify();
    }

    public static ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityPlayOpenAnimNotify>
        PARSER = new com.google.protobuf.AbstractParser<ActivityPlayOpenAnimNotify>() {
      @java.lang.Override
      public ActivityPlayOpenAnimNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityPlayOpenAnimNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityPlayOpenAnimNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityPlayOpenAnimNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityPlayOpenAnimNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityPlayOpenAnimNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ActivityPlayOpenAnimNotify.proto\"\222\001\n\032A" +
      "ctivityPlayOpenAnimNotify\022\022\n\nactivityId\030" +
      "\017 \001(\r\"`\n\013BOFOPFKDLEN\022\010\n\004NONE\020\000\022\020\n\013PEPPOH" +
      "PHJOJ\020\202\021\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA" +
      "\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityPlayOpenAnimNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityPlayOpenAnimNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityPlayOpenAnimNotify_descriptor,
        new java.lang.String[] { "ActivityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

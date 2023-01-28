// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeReunionSignInRewardReq.proto

public final class TakeReunionSignInRewardReqOuterClass {
  private TakeReunionSignInRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeReunionSignInRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeReunionSignInRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 rewardDay = 2;</code>
     * @return The rewardDay.
     */
    int getRewardDay();

    /**
     * <code>uint32 configId = 3;</code>
     * @return The configId.
     */
    int getConfigId();
  }
  /**
   * Protobuf type {@code TakeReunionSignInRewardReq}
   */
  public static final class TakeReunionSignInRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeReunionSignInRewardReq)
      TakeReunionSignInRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeReunionSignInRewardReq.newBuilder() to construct.
    private TakeReunionSignInRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeReunionSignInRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeReunionSignInRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeReunionSignInRewardReq(
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
            case 16: {

              rewardDay_ = input.readUInt32();
              break;
            }
            case 24: {

              configId_ = input.readUInt32();
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
      return TakeReunionSignInRewardReqOuterClass.internal_static_TakeReunionSignInRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TakeReunionSignInRewardReqOuterClass.internal_static_TakeReunionSignInRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.class, TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.Builder.class);
    }

    /**
     * Protobuf enum {@code TakeReunionSignInRewardReq.DLLEHPPIPEL}
     */
    public enum DLLEHPPIPEL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 5081;</code>
       */
      PEPPOHPHJOJ(1, 5081),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final DLLEHPPIPEL DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final DLLEHPPIPEL EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 5081;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 5081;
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
      public static DLLEHPPIPEL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DLLEHPPIPEL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 5081: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DLLEHPPIPEL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DLLEHPPIPEL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DLLEHPPIPEL>() {
              public DLLEHPPIPEL findValueByNumber(int number) {
                return DLLEHPPIPEL.forNumber(number);
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
        return TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final DLLEHPPIPEL[] VALUES = getStaticValuesArray();
      private static DLLEHPPIPEL[] getStaticValuesArray() {
        return new DLLEHPPIPEL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static DLLEHPPIPEL valueOf(
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

      private DLLEHPPIPEL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:TakeReunionSignInRewardReq.DLLEHPPIPEL)
    }

    public static final int REWARDDAY_FIELD_NUMBER = 2;
    private int rewardDay_;
    /**
     * <code>uint32 rewardDay = 2;</code>
     * @return The rewardDay.
     */
    @java.lang.Override
    public int getRewardDay() {
      return rewardDay_;
    }

    public static final int CONFIGID_FIELD_NUMBER = 3;
    private int configId_;
    /**
     * <code>uint32 configId = 3;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
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
      if (rewardDay_ != 0) {
        output.writeUInt32(2, rewardDay_);
      }
      if (configId_ != 0) {
        output.writeUInt32(3, configId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rewardDay_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, rewardDay_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, configId_);
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
      if (!(obj instanceof TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq)) {
        return super.equals(obj);
      }
      TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq other = (TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq) obj;

      if (getRewardDay()
          != other.getRewardDay()) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
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
      hash = (37 * hash) + REWARDDAY_FIELD_NUMBER;
      hash = (53 * hash) + getRewardDay();
      hash = (37 * hash) + CONFIGID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parseFrom(
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
    public static Builder newBuilder(TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq prototype) {
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
     * Protobuf type {@code TakeReunionSignInRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeReunionSignInRewardReq)
        TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TakeReunionSignInRewardReqOuterClass.internal_static_TakeReunionSignInRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TakeReunionSignInRewardReqOuterClass.internal_static_TakeReunionSignInRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.class, TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.Builder.class);
      }

      // Construct using TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.newBuilder()
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
        rewardDay_ = 0;

        configId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TakeReunionSignInRewardReqOuterClass.internal_static_TakeReunionSignInRewardReq_descriptor;
      }

      @java.lang.Override
      public TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq getDefaultInstanceForType() {
        return TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq build() {
        TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq buildPartial() {
        TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq result = new TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq(this);
        result.rewardDay_ = rewardDay_;
        result.configId_ = configId_;
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
        if (other instanceof TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq) {
          return mergeFrom((TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq other) {
        if (other == TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq.getDefaultInstance()) return this;
        if (other.getRewardDay() != 0) {
          setRewardDay(other.getRewardDay());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
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
        TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rewardDay_ ;
      /**
       * <code>uint32 rewardDay = 2;</code>
       * @return The rewardDay.
       */
      @java.lang.Override
      public int getRewardDay() {
        return rewardDay_;
      }
      /**
       * <code>uint32 rewardDay = 2;</code>
       * @param value The rewardDay to set.
       * @return This builder for chaining.
       */
      public Builder setRewardDay(int value) {
        
        rewardDay_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rewardDay = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardDay() {
        
        rewardDay_ = 0;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 configId = 3;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 configId = 3;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 configId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeReunionSignInRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TakeReunionSignInRewardReq)
    private static final TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq();
    }

    public static TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeReunionSignInRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeReunionSignInRewardReq>() {
      @java.lang.Override
      public TakeReunionSignInRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeReunionSignInRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeReunionSignInRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeReunionSignInRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public TakeReunionSignInRewardReqOuterClass.TakeReunionSignInRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeReunionSignInRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeReunionSignInRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n TakeReunionSignInRewardReq.proto\"\243\001\n\032T" +
      "akeReunionSignInRewardReq\022\021\n\trewardDay\030\002" +
      " \001(\r\022\020\n\010configId\030\003 \001(\r\"`\n\013DLLEHPPIPEL\022\010\n" +
      "\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\331\'\022\017\n\013DCDNILFDFLB" +
      "\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeReunionSignInRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeReunionSignInRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeReunionSignInRewardReq_descriptor,
        new java.lang.String[] { "RewardDay", "ConfigId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeGameTimeRsp.proto

public final class ChangeGameTimeRspOuterClass {
  private ChangeGameTimeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeGameTimeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeGameTimeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 curGameTime = 15;</code>
     * @return The curGameTime.
     */
    int getCurGameTime();

    /**
     * <code>uint32 extraDays = 5;</code>
     * @return The extraDays.
     */
    int getExtraDays();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code ChangeGameTimeRsp}
   */
  public static final class ChangeGameTimeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeGameTimeRsp)
      ChangeGameTimeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeGameTimeRsp.newBuilder() to construct.
    private ChangeGameTimeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeGameTimeRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeGameTimeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeGameTimeRsp(
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
            case 40: {

              extraDays_ = input.readUInt32();
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {

              curGameTime_ = input.readUInt32();
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
      return ChangeGameTimeRspOuterClass.internal_static_ChangeGameTimeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChangeGameTimeRspOuterClass.internal_static_ChangeGameTimeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.class, ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code ChangeGameTimeRsp.LAFFGLCBMLP}
     */
    public enum LAFFGLCBMLP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 114;</code>
       */
      PEPPOHPHJOJ(1, 114),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final LAFFGLCBMLP DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 114;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 114;
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
      public static LAFFGLCBMLP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static LAFFGLCBMLP forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 114: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<LAFFGLCBMLP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          LAFFGLCBMLP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<LAFFGLCBMLP>() {
              public LAFFGLCBMLP findValueByNumber(int number) {
                return LAFFGLCBMLP.forNumber(number);
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
        return ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final LAFFGLCBMLP[] VALUES = getStaticValuesArray();
      private static LAFFGLCBMLP[] getStaticValuesArray() {
        return new LAFFGLCBMLP[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static LAFFGLCBMLP valueOf(
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

      private LAFFGLCBMLP(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ChangeGameTimeRsp.LAFFGLCBMLP)
    }

    public static final int CURGAMETIME_FIELD_NUMBER = 15;
    private int curGameTime_;
    /**
     * <code>uint32 curGameTime = 15;</code>
     * @return The curGameTime.
     */
    @java.lang.Override
    public int getCurGameTime() {
      return curGameTime_;
    }

    public static final int EXTRADAYS_FIELD_NUMBER = 5;
    private int extraDays_;
    /**
     * <code>uint32 extraDays = 5;</code>
     * @return The extraDays.
     */
    @java.lang.Override
    public int getExtraDays() {
      return extraDays_;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (extraDays_ != 0) {
        output.writeUInt32(5, extraDays_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (curGameTime_ != 0) {
        output.writeUInt32(15, curGameTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (extraDays_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, extraDays_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (curGameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, curGameTime_);
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
      if (!(obj instanceof ChangeGameTimeRspOuterClass.ChangeGameTimeRsp)) {
        return super.equals(obj);
      }
      ChangeGameTimeRspOuterClass.ChangeGameTimeRsp other = (ChangeGameTimeRspOuterClass.ChangeGameTimeRsp) obj;

      if (getCurGameTime()
          != other.getCurGameTime()) return false;
      if (getExtraDays()
          != other.getExtraDays()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + CURGAMETIME_FIELD_NUMBER;
      hash = (53 * hash) + getCurGameTime();
      hash = (37 * hash) + EXTRADAYS_FIELD_NUMBER;
      hash = (53 * hash) + getExtraDays();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
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
    public static Builder newBuilder(ChangeGameTimeRspOuterClass.ChangeGameTimeRsp prototype) {
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
     * Protobuf type {@code ChangeGameTimeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeGameTimeRsp)
        ChangeGameTimeRspOuterClass.ChangeGameTimeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChangeGameTimeRspOuterClass.internal_static_ChangeGameTimeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChangeGameTimeRspOuterClass.internal_static_ChangeGameTimeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.class, ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.Builder.class);
      }

      // Construct using ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.newBuilder()
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
        curGameTime_ = 0;

        extraDays_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChangeGameTimeRspOuterClass.internal_static_ChangeGameTimeRsp_descriptor;
      }

      @java.lang.Override
      public ChangeGameTimeRspOuterClass.ChangeGameTimeRsp getDefaultInstanceForType() {
        return ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public ChangeGameTimeRspOuterClass.ChangeGameTimeRsp build() {
        ChangeGameTimeRspOuterClass.ChangeGameTimeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ChangeGameTimeRspOuterClass.ChangeGameTimeRsp buildPartial() {
        ChangeGameTimeRspOuterClass.ChangeGameTimeRsp result = new ChangeGameTimeRspOuterClass.ChangeGameTimeRsp(this);
        result.curGameTime_ = curGameTime_;
        result.extraDays_ = extraDays_;
        result.retcode_ = retcode_;
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
        if (other instanceof ChangeGameTimeRspOuterClass.ChangeGameTimeRsp) {
          return mergeFrom((ChangeGameTimeRspOuterClass.ChangeGameTimeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChangeGameTimeRspOuterClass.ChangeGameTimeRsp other) {
        if (other == ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.getDefaultInstance()) return this;
        if (other.getCurGameTime() != 0) {
          setCurGameTime(other.getCurGameTime());
        }
        if (other.getExtraDays() != 0) {
          setExtraDays(other.getExtraDays());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChangeGameTimeRspOuterClass.ChangeGameTimeRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int curGameTime_ ;
      /**
       * <code>uint32 curGameTime = 15;</code>
       * @return The curGameTime.
       */
      @java.lang.Override
      public int getCurGameTime() {
        return curGameTime_;
      }
      /**
       * <code>uint32 curGameTime = 15;</code>
       * @param value The curGameTime to set.
       * @return This builder for chaining.
       */
      public Builder setCurGameTime(int value) {
        
        curGameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 curGameTime = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurGameTime() {
        
        curGameTime_ = 0;
        onChanged();
        return this;
      }

      private int extraDays_ ;
      /**
       * <code>uint32 extraDays = 5;</code>
       * @return The extraDays.
       */
      @java.lang.Override
      public int getExtraDays() {
        return extraDays_;
      }
      /**
       * <code>uint32 extraDays = 5;</code>
       * @param value The extraDays to set.
       * @return This builder for chaining.
       */
      public Builder setExtraDays(int value) {
        
        extraDays_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 extraDays = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearExtraDays() {
        
        extraDays_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChangeGameTimeRsp)
    }

    // @@protoc_insertion_point(class_scope:ChangeGameTimeRsp)
    private static final ChangeGameTimeRspOuterClass.ChangeGameTimeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChangeGameTimeRspOuterClass.ChangeGameTimeRsp();
    }

    public static ChangeGameTimeRspOuterClass.ChangeGameTimeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeGameTimeRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChangeGameTimeRsp>() {
      @java.lang.Override
      public ChangeGameTimeRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeGameTimeRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeGameTimeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeGameTimeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ChangeGameTimeRspOuterClass.ChangeGameTimeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeGameTimeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeGameTimeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ChangeGameTimeRsp.proto\"\234\001\n\021ChangeGame" +
      "TimeRsp\022\023\n\013curGameTime\030\017 \001(\r\022\021\n\textraDay" +
      "s\030\005 \001(\r\022\017\n\007retcode\030\007 \001(\005\"N\n\013LAFFGLCBMLP\022" +
      "\010\n\004NONE\020\000\022\017\n\013PEPPOHPHJOJ\020r\022\017\n\013DCDNILFDFL" +
      "B\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeGameTimeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeGameTimeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeGameTimeRsp_descriptor,
        new java.lang.String[] { "CurGameTime", "ExtraDays", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

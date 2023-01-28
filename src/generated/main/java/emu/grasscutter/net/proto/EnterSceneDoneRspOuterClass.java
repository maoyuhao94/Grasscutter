// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterSceneDoneRsp.proto

public final class EnterSceneDoneRspOuterClass {
  private EnterSceneDoneRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterSceneDoneRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterSceneDoneRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 enterSceneToken = 9;</code>
     * @return The enterSceneToken.
     */
    int getEnterSceneToken();
  }
  /**
   * Protobuf type {@code EnterSceneDoneRsp}
   */
  public static final class EnterSceneDoneRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterSceneDoneRsp)
      EnterSceneDoneRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterSceneDoneRsp.newBuilder() to construct.
    private EnterSceneDoneRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterSceneDoneRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterSceneDoneRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnterSceneDoneRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 72: {

              enterSceneToken_ = input.readUInt32();
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
      return EnterSceneDoneRspOuterClass.internal_static_EnterSceneDoneRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EnterSceneDoneRspOuterClass.internal_static_EnterSceneDoneRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EnterSceneDoneRspOuterClass.EnterSceneDoneRsp.class, EnterSceneDoneRspOuterClass.EnterSceneDoneRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code EnterSceneDoneRsp.OFOIBCBAPFF}
     */
    public enum OFOIBCBAPFF
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 297;</code>
       */
      PEPPOHPHJOJ(1, 297),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final OFOIBCBAPFF DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 297;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 297;
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
      public static OFOIBCBAPFF valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OFOIBCBAPFF forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 297: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OFOIBCBAPFF>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          OFOIBCBAPFF> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OFOIBCBAPFF>() {
              public OFOIBCBAPFF findValueByNumber(int number) {
                return OFOIBCBAPFF.forNumber(number);
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
        return EnterSceneDoneRspOuterClass.EnterSceneDoneRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final OFOIBCBAPFF[] VALUES = getStaticValuesArray();
      private static OFOIBCBAPFF[] getStaticValuesArray() {
        return new OFOIBCBAPFF[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static OFOIBCBAPFF valueOf(
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

      private OFOIBCBAPFF(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:EnterSceneDoneRsp.OFOIBCBAPFF)
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ENTERSCENETOKEN_FIELD_NUMBER = 9;
    private int enterSceneToken_;
    /**
     * <code>uint32 enterSceneToken = 9;</code>
     * @return The enterSceneToken.
     */
    @java.lang.Override
    public int getEnterSceneToken() {
      return enterSceneToken_;
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
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (enterSceneToken_ != 0) {
        output.writeUInt32(9, enterSceneToken_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (enterSceneToken_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, enterSceneToken_);
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
      if (!(obj instanceof EnterSceneDoneRspOuterClass.EnterSceneDoneRsp)) {
        return super.equals(obj);
      }
      EnterSceneDoneRspOuterClass.EnterSceneDoneRsp other = (EnterSceneDoneRspOuterClass.EnterSceneDoneRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getEnterSceneToken()
          != other.getEnterSceneToken()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ENTERSCENETOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getEnterSceneToken();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parseFrom(
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
    public static Builder newBuilder(EnterSceneDoneRspOuterClass.EnterSceneDoneRsp prototype) {
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
     * Protobuf type {@code EnterSceneDoneRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterSceneDoneRsp)
        EnterSceneDoneRspOuterClass.EnterSceneDoneRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EnterSceneDoneRspOuterClass.internal_static_EnterSceneDoneRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EnterSceneDoneRspOuterClass.internal_static_EnterSceneDoneRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EnterSceneDoneRspOuterClass.EnterSceneDoneRsp.class, EnterSceneDoneRspOuterClass.EnterSceneDoneRsp.Builder.class);
      }

      // Construct using EnterSceneDoneRspOuterClass.EnterSceneDoneRsp.newBuilder()
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
        retcode_ = 0;

        enterSceneToken_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EnterSceneDoneRspOuterClass.internal_static_EnterSceneDoneRsp_descriptor;
      }

      @java.lang.Override
      public EnterSceneDoneRspOuterClass.EnterSceneDoneRsp getDefaultInstanceForType() {
        return EnterSceneDoneRspOuterClass.EnterSceneDoneRsp.getDefaultInstance();
      }

      @java.lang.Override
      public EnterSceneDoneRspOuterClass.EnterSceneDoneRsp build() {
        EnterSceneDoneRspOuterClass.EnterSceneDoneRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public EnterSceneDoneRspOuterClass.EnterSceneDoneRsp buildPartial() {
        EnterSceneDoneRspOuterClass.EnterSceneDoneRsp result = new EnterSceneDoneRspOuterClass.EnterSceneDoneRsp(this);
        result.retcode_ = retcode_;
        result.enterSceneToken_ = enterSceneToken_;
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
        if (other instanceof EnterSceneDoneRspOuterClass.EnterSceneDoneRsp) {
          return mergeFrom((EnterSceneDoneRspOuterClass.EnterSceneDoneRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EnterSceneDoneRspOuterClass.EnterSceneDoneRsp other) {
        if (other == EnterSceneDoneRspOuterClass.EnterSceneDoneRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getEnterSceneToken() != 0) {
          setEnterSceneToken(other.getEnterSceneToken());
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
        EnterSceneDoneRspOuterClass.EnterSceneDoneRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EnterSceneDoneRspOuterClass.EnterSceneDoneRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int enterSceneToken_ ;
      /**
       * <code>uint32 enterSceneToken = 9;</code>
       * @return The enterSceneToken.
       */
      @java.lang.Override
      public int getEnterSceneToken() {
        return enterSceneToken_;
      }
      /**
       * <code>uint32 enterSceneToken = 9;</code>
       * @param value The enterSceneToken to set.
       * @return This builder for chaining.
       */
      public Builder setEnterSceneToken(int value) {
        
        enterSceneToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 enterSceneToken = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterSceneToken() {
        
        enterSceneToken_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EnterSceneDoneRsp)
    }

    // @@protoc_insertion_point(class_scope:EnterSceneDoneRsp)
    private static final EnterSceneDoneRspOuterClass.EnterSceneDoneRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EnterSceneDoneRspOuterClass.EnterSceneDoneRsp();
    }

    public static EnterSceneDoneRspOuterClass.EnterSceneDoneRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterSceneDoneRsp>
        PARSER = new com.google.protobuf.AbstractParser<EnterSceneDoneRsp>() {
      @java.lang.Override
      public EnterSceneDoneRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnterSceneDoneRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnterSceneDoneRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterSceneDoneRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public EnterSceneDoneRspOuterClass.EnterSceneDoneRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterSceneDoneRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterSceneDoneRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027EnterSceneDoneRsp.proto\"\216\001\n\021EnterScene" +
      "DoneRsp\022\017\n\007retcode\030\005 \001(\005\022\027\n\017enterSceneTo" +
      "ken\030\t \001(\r\"O\n\013OFOIBCBAPFF\022\010\n\004NONE\020\000\022\020\n\013PE" +
      "PPOHPHJOJ\020\251\002\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLM" +
      "POEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterSceneDoneRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterSceneDoneRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterSceneDoneRsp_descriptor,
        new java.lang.String[] { "Retcode", "EnterSceneToken", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddQuestContentProgressRsp.proto

public final class AddQuestContentProgressRspOuterClass {
  private AddQuestContentProgressRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AddQuestContentProgressRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AddQuestContentProgressRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 contentType = 13;</code>
     * @return The contentType.
     */
    int getContentType();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code AddQuestContentProgressRsp}
   */
  public static final class AddQuestContentProgressRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AddQuestContentProgressRsp)
      AddQuestContentProgressRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AddQuestContentProgressRsp.newBuilder() to construct.
    private AddQuestContentProgressRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddQuestContentProgressRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AddQuestContentProgressRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AddQuestContentProgressRsp(
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
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 104: {

              contentType_ = input.readUInt32();
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
      return AddQuestContentProgressRspOuterClass.internal_static_AddQuestContentProgressRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AddQuestContentProgressRspOuterClass.internal_static_AddQuestContentProgressRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp.class, AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code AddQuestContentProgressRsp.OCHDKHKOIKI}
     */
    public enum OCHDKHKOIKI
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 480;</code>
       */
      PEPPOHPHJOJ(1, 480),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final OCHDKHKOIKI DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 480;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 480;
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
      public static OCHDKHKOIKI valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OCHDKHKOIKI forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 480: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OCHDKHKOIKI>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          OCHDKHKOIKI> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OCHDKHKOIKI>() {
              public OCHDKHKOIKI findValueByNumber(int number) {
                return OCHDKHKOIKI.forNumber(number);
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
        return AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final OCHDKHKOIKI[] VALUES = getStaticValuesArray();
      private static OCHDKHKOIKI[] getStaticValuesArray() {
        return new OCHDKHKOIKI[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static OCHDKHKOIKI valueOf(
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

      private OCHDKHKOIKI(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AddQuestContentProgressRsp.OCHDKHKOIKI)
    }

    public static final int CONTENTTYPE_FIELD_NUMBER = 13;
    private int contentType_;
    /**
     * <code>uint32 contentType = 13;</code>
     * @return The contentType.
     */
    @java.lang.Override
    public int getContentType() {
      return contentType_;
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
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
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (contentType_ != 0) {
        output.writeUInt32(13, contentType_);
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
          .computeInt32Size(8, retcode_);
      }
      if (contentType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, contentType_);
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
      if (!(obj instanceof AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp)) {
        return super.equals(obj);
      }
      AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp other = (AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp) obj;

      if (getContentType()
          != other.getContentType()) return false;
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
      hash = (37 * hash) + CONTENTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getContentType();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parseFrom(
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
    public static Builder newBuilder(AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp prototype) {
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
     * Protobuf type {@code AddQuestContentProgressRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AddQuestContentProgressRsp)
        AddQuestContentProgressRspOuterClass.AddQuestContentProgressRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AddQuestContentProgressRspOuterClass.internal_static_AddQuestContentProgressRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AddQuestContentProgressRspOuterClass.internal_static_AddQuestContentProgressRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp.class, AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp.Builder.class);
      }

      // Construct using AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp.newBuilder()
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
        contentType_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AddQuestContentProgressRspOuterClass.internal_static_AddQuestContentProgressRsp_descriptor;
      }

      @java.lang.Override
      public AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp getDefaultInstanceForType() {
        return AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp.getDefaultInstance();
      }

      @java.lang.Override
      public AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp build() {
        AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp buildPartial() {
        AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp result = new AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp(this);
        result.contentType_ = contentType_;
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
        if (other instanceof AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp) {
          return mergeFrom((AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp other) {
        if (other == AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp.getDefaultInstance()) return this;
        if (other.getContentType() != 0) {
          setContentType(other.getContentType());
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
        AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int contentType_ ;
      /**
       * <code>uint32 contentType = 13;</code>
       * @return The contentType.
       */
      @java.lang.Override
      public int getContentType() {
        return contentType_;
      }
      /**
       * <code>uint32 contentType = 13;</code>
       * @param value The contentType to set.
       * @return This builder for chaining.
       */
      public Builder setContentType(int value) {
        
        contentType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 contentType = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearContentType() {
        
        contentType_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
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


      // @@protoc_insertion_point(builder_scope:AddQuestContentProgressRsp)
    }

    // @@protoc_insertion_point(class_scope:AddQuestContentProgressRsp)
    private static final AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp();
    }

    public static AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AddQuestContentProgressRsp>
        PARSER = new com.google.protobuf.AbstractParser<AddQuestContentProgressRsp>() {
      @java.lang.Override
      public AddQuestContentProgressRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AddQuestContentProgressRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AddQuestContentProgressRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AddQuestContentProgressRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddQuestContentProgressRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddQuestContentProgressRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n AddQuestContentProgressRsp.proto\"\223\001\n\032A" +
      "ddQuestContentProgressRsp\022\023\n\013contentType" +
      "\030\r \001(\r\022\017\n\007retcode\030\010 \001(\005\"O\n\013OCHDKHKOIKI\022\010" +
      "\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\340\003\022\017\n\013DCDNILFDFL" +
      "B\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AddQuestContentProgressRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AddQuestContentProgressRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddQuestContentProgressRsp_descriptor,
        new java.lang.String[] { "ContentType", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

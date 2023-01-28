// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GearActivityFinishPlayPictureRsp.proto

public final class GearActivityFinishPlayPictureRspOuterClass {
  private GearActivityFinishPlayPictureRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GearActivityFinishPlayPictureRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GearActivityFinishPlayPictureRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool isSuccess = 7;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();
  }
  /**
   * Protobuf type {@code GearActivityFinishPlayPictureRsp}
   */
  public static final class GearActivityFinishPlayPictureRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GearActivityFinishPlayPictureRsp)
      GearActivityFinishPlayPictureRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GearActivityFinishPlayPictureRsp.newBuilder() to construct.
    private GearActivityFinishPlayPictureRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GearActivityFinishPlayPictureRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GearActivityFinishPlayPictureRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GearActivityFinishPlayPictureRsp(
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
            case 56: {

              isSuccess_ = input.readBool();
              break;
            }
            case 64: {

              retcode_ = input.readInt32();
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
      return GearActivityFinishPlayPictureRspOuterClass.internal_static_GearActivityFinishPlayPictureRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GearActivityFinishPlayPictureRspOuterClass.internal_static_GearActivityFinishPlayPictureRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp.class, GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code GearActivityFinishPlayPictureRsp.CLAENFFGOJG}
     */
    public enum CLAENFFGOJG
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 21610;</code>
       */
      PEPPOHPHJOJ(1, 21610),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final CLAENFFGOJG DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 21610;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 21610;
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
      public static CLAENFFGOJG valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CLAENFFGOJG forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 21610: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CLAENFFGOJG>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CLAENFFGOJG> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CLAENFFGOJG>() {
              public CLAENFFGOJG findValueByNumber(int number) {
                return CLAENFFGOJG.forNumber(number);
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
        return GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final CLAENFFGOJG[] VALUES = getStaticValuesArray();
      private static CLAENFFGOJG[] getStaticValuesArray() {
        return new CLAENFFGOJG[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static CLAENFFGOJG valueOf(
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

      private CLAENFFGOJG(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:GearActivityFinishPlayPictureRsp.CLAENFFGOJG)
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

    public static final int ISSUCCESS_FIELD_NUMBER = 7;
    private boolean isSuccess_;
    /**
     * <code>bool isSuccess = 7;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
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
      if (isSuccess_ != false) {
        output.writeBool(7, isSuccess_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isSuccess_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
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
      if (!(obj instanceof GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp)) {
        return super.equals(obj);
      }
      GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp other = (GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
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
      hash = (37 * hash) + ISSUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parseFrom(
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
    public static Builder newBuilder(GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp prototype) {
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
     * Protobuf type {@code GearActivityFinishPlayPictureRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GearActivityFinishPlayPictureRsp)
        GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GearActivityFinishPlayPictureRspOuterClass.internal_static_GearActivityFinishPlayPictureRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GearActivityFinishPlayPictureRspOuterClass.internal_static_GearActivityFinishPlayPictureRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp.class, GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp.Builder.class);
      }

      // Construct using GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp.newBuilder()
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

        isSuccess_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GearActivityFinishPlayPictureRspOuterClass.internal_static_GearActivityFinishPlayPictureRsp_descriptor;
      }

      @java.lang.Override
      public GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp getDefaultInstanceForType() {
        return GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp.getDefaultInstance();
      }

      @java.lang.Override
      public GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp build() {
        GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp buildPartial() {
        GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp result = new GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp(this);
        result.retcode_ = retcode_;
        result.isSuccess_ = isSuccess_;
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
        if (other instanceof GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp) {
          return mergeFrom((GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp other) {
        if (other == GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
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
        GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp) e.getUnfinishedMessage();
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

      private boolean isSuccess_ ;
      /**
       * <code>bool isSuccess = 7;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool isSuccess = 7;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isSuccess = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
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


      // @@protoc_insertion_point(builder_scope:GearActivityFinishPlayPictureRsp)
    }

    // @@protoc_insertion_point(class_scope:GearActivityFinishPlayPictureRsp)
    private static final GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp();
    }

    public static GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GearActivityFinishPlayPictureRsp>
        PARSER = new com.google.protobuf.AbstractParser<GearActivityFinishPlayPictureRsp>() {
      @java.lang.Override
      public GearActivityFinishPlayPictureRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GearActivityFinishPlayPictureRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GearActivityFinishPlayPictureRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GearActivityFinishPlayPictureRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GearActivityFinishPlayPictureRspOuterClass.GearActivityFinishPlayPictureRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GearActivityFinishPlayPictureRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GearActivityFinishPlayPictureRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&GearActivityFinishPlayPictureRsp.proto" +
      "\"\230\001\n GearActivityFinishPlayPictureRsp\022\017\n" +
      "\007retcode\030\010 \001(\005\022\021\n\tisSuccess\030\007 \001(\010\"P\n\013CLA" +
      "ENFFGOJG\022\010\n\004NONE\020\000\022\021\n\013PEPPOHPHJOJ\020\352\250\001\022\017\n" +
      "\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GearActivityFinishPlayPictureRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GearActivityFinishPlayPictureRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GearActivityFinishPlayPictureRsp_descriptor,
        new java.lang.String[] { "Retcode", "IsSuccess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

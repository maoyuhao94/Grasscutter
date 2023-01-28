// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UseWidgetCreateGadgetRsp.proto

public final class UseWidgetCreateGadgetRspOuterClass {
  private UseWidgetCreateGadgetRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UseWidgetCreateGadgetRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UseWidgetCreateGadgetRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 materialId = 13;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code UseWidgetCreateGadgetRsp}
   */
  public static final class UseWidgetCreateGadgetRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UseWidgetCreateGadgetRsp)
      UseWidgetCreateGadgetRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UseWidgetCreateGadgetRsp.newBuilder() to construct.
    private UseWidgetCreateGadgetRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UseWidgetCreateGadgetRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UseWidgetCreateGadgetRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UseWidgetCreateGadgetRsp(
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
            case 32: {

              retcode_ = input.readInt32();
              break;
            }
            case 104: {

              materialId_ = input.readUInt32();
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
      return UseWidgetCreateGadgetRspOuterClass.internal_static_UseWidgetCreateGadgetRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UseWidgetCreateGadgetRspOuterClass.internal_static_UseWidgetCreateGadgetRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp.class, UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code UseWidgetCreateGadgetRsp.PFEKLKGCPGM}
     */
    public enum PFEKLKGCPGM
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4267;</code>
       */
      PEPPOHPHJOJ(1, 4267),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final PFEKLKGCPGM DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4267;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4267;
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
      public static PFEKLKGCPGM valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PFEKLKGCPGM forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4267: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PFEKLKGCPGM>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PFEKLKGCPGM> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PFEKLKGCPGM>() {
              public PFEKLKGCPGM findValueByNumber(int number) {
                return PFEKLKGCPGM.forNumber(number);
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
        return UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final PFEKLKGCPGM[] VALUES = getStaticValuesArray();
      private static PFEKLKGCPGM[] getStaticValuesArray() {
        return new PFEKLKGCPGM[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static PFEKLKGCPGM valueOf(
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

      private PFEKLKGCPGM(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:UseWidgetCreateGadgetRsp.PFEKLKGCPGM)
    }

    public static final int MATERIALID_FIELD_NUMBER = 13;
    private int materialId_;
    /**
     * <code>uint32 materialId = 13;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
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
        output.writeInt32(4, retcode_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(13, materialId_);
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
          .computeInt32Size(4, retcode_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, materialId_);
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
      if (!(obj instanceof UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp)) {
        return super.equals(obj);
      }
      UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp other = (UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp) obj;

      if (getMaterialId()
          != other.getMaterialId()) return false;
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
      hash = (37 * hash) + MATERIALID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parseFrom(
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
    public static Builder newBuilder(UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp prototype) {
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
     * Protobuf type {@code UseWidgetCreateGadgetRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UseWidgetCreateGadgetRsp)
        UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return UseWidgetCreateGadgetRspOuterClass.internal_static_UseWidgetCreateGadgetRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return UseWidgetCreateGadgetRspOuterClass.internal_static_UseWidgetCreateGadgetRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp.class, UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp.Builder.class);
      }

      // Construct using UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp.newBuilder()
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
        materialId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return UseWidgetCreateGadgetRspOuterClass.internal_static_UseWidgetCreateGadgetRsp_descriptor;
      }

      @java.lang.Override
      public UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp getDefaultInstanceForType() {
        return UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp.getDefaultInstance();
      }

      @java.lang.Override
      public UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp build() {
        UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp buildPartial() {
        UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp result = new UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp(this);
        result.materialId_ = materialId_;
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
        if (other instanceof UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp) {
          return mergeFrom((UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp other) {
        if (other == UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp.getDefaultInstance()) return this;
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
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
        UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 materialId = 13;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 materialId = 13;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 materialId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
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


      // @@protoc_insertion_point(builder_scope:UseWidgetCreateGadgetRsp)
    }

    // @@protoc_insertion_point(class_scope:UseWidgetCreateGadgetRsp)
    private static final UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp();
    }

    public static UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UseWidgetCreateGadgetRsp>
        PARSER = new com.google.protobuf.AbstractParser<UseWidgetCreateGadgetRsp>() {
      @java.lang.Override
      public UseWidgetCreateGadgetRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UseWidgetCreateGadgetRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UseWidgetCreateGadgetRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UseWidgetCreateGadgetRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public UseWidgetCreateGadgetRspOuterClass.UseWidgetCreateGadgetRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UseWidgetCreateGadgetRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UseWidgetCreateGadgetRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036UseWidgetCreateGadgetRsp.proto\"\220\001\n\030Use" +
      "WidgetCreateGadgetRsp\022\022\n\nmaterialId\030\r \001(" +
      "\r\022\017\n\007retcode\030\004 \001(\005\"O\n\013PFEKLKGCPGM\022\010\n\004NON" +
      "E\020\000\022\020\n\013PEPPOHPHJOJ\020\253!\022\017\n\013DCDNILFDFLB\020\000\022\017" +
      "\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UseWidgetCreateGadgetRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UseWidgetCreateGadgetRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UseWidgetCreateGadgetRsp_descriptor,
        new java.lang.String[] { "MaterialId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

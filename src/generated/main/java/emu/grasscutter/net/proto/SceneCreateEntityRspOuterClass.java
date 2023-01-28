// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneCreateEntityRsp.proto

public final class SceneCreateEntityRspOuterClass {
  private SceneCreateEntityRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneCreateEntityRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneCreateEntityRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entityId = 2;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.CreateEntityInfo entity = 4;</code>
     * @return Whether the entity field is set.
     */
    boolean hasEntity();
    /**
     * <code>.CreateEntityInfo entity = 4;</code>
     * @return The entity.
     */
    CreateEntityInfoOuterClass.CreateEntityInfo getEntity();
    /**
     * <code>.CreateEntityInfo entity = 4;</code>
     */
    CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code SceneCreateEntityRsp}
   */
  public static final class SceneCreateEntityRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneCreateEntityRsp)
      SceneCreateEntityRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneCreateEntityRsp.newBuilder() to construct.
    private SceneCreateEntityRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneCreateEntityRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneCreateEntityRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneCreateEntityRsp(
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
            case 8: {

              retcode_ = input.readInt32();
              break;
            }
            case 16: {

              entityId_ = input.readUInt32();
              break;
            }
            case 34: {
              CreateEntityInfoOuterClass.CreateEntityInfo.Builder subBuilder = null;
              if (entity_ != null) {
                subBuilder = entity_.toBuilder();
              }
              entity_ = input.readMessage(CreateEntityInfoOuterClass.CreateEntityInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entity_);
                entity_ = subBuilder.buildPartial();
              }

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
      return SceneCreateEntityRspOuterClass.internal_static_SceneCreateEntityRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SceneCreateEntityRspOuterClass.internal_static_SceneCreateEntityRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SceneCreateEntityRspOuterClass.SceneCreateEntityRsp.class, SceneCreateEntityRspOuterClass.SceneCreateEntityRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code SceneCreateEntityRsp.MDAIMAJAHBL}
     */
    public enum MDAIMAJAHBL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 273;</code>
       */
      PEPPOHPHJOJ(1, 273),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MDAIMAJAHBL DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 273;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 273;
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
      public static MDAIMAJAHBL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MDAIMAJAHBL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 273: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MDAIMAJAHBL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MDAIMAJAHBL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MDAIMAJAHBL>() {
              public MDAIMAJAHBL findValueByNumber(int number) {
                return MDAIMAJAHBL.forNumber(number);
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
        return SceneCreateEntityRspOuterClass.SceneCreateEntityRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final MDAIMAJAHBL[] VALUES = getStaticValuesArray();
      private static MDAIMAJAHBL[] getStaticValuesArray() {
        return new MDAIMAJAHBL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static MDAIMAJAHBL valueOf(
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

      private MDAIMAJAHBL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SceneCreateEntityRsp.MDAIMAJAHBL)
    }

    public static final int ENTITYID_FIELD_NUMBER = 2;
    private int entityId_;
    /**
     * <code>uint32 entityId = 2;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int ENTITY_FIELD_NUMBER = 4;
    private CreateEntityInfoOuterClass.CreateEntityInfo entity_;
    /**
     * <code>.CreateEntityInfo entity = 4;</code>
     * @return Whether the entity field is set.
     */
    @java.lang.Override
    public boolean hasEntity() {
      return entity_ != null;
    }
    /**
     * <code>.CreateEntityInfo entity = 4;</code>
     * @return The entity.
     */
    @java.lang.Override
    public CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
      return entity_ == null ? CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
    }
    /**
     * <code>.CreateEntityInfo entity = 4;</code>
     */
    @java.lang.Override
    public CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
      return getEntity();
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
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
        output.writeInt32(1, retcode_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(2, entityId_);
      }
      if (entity_ != null) {
        output.writeMessage(4, getEntity());
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
          .computeInt32Size(1, retcode_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, entityId_);
      }
      if (entity_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getEntity());
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
      if (!(obj instanceof SceneCreateEntityRspOuterClass.SceneCreateEntityRsp)) {
        return super.equals(obj);
      }
      SceneCreateEntityRspOuterClass.SceneCreateEntityRsp other = (SceneCreateEntityRspOuterClass.SceneCreateEntityRsp) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasEntity() != other.hasEntity()) return false;
      if (hasEntity()) {
        if (!getEntity()
            .equals(other.getEntity())) return false;
      }
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
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasEntity()) {
        hash = (37 * hash) + ENTITY_FIELD_NUMBER;
        hash = (53 * hash) + getEntity().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parseFrom(
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
    public static Builder newBuilder(SceneCreateEntityRspOuterClass.SceneCreateEntityRsp prototype) {
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
     * Protobuf type {@code SceneCreateEntityRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneCreateEntityRsp)
        SceneCreateEntityRspOuterClass.SceneCreateEntityRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SceneCreateEntityRspOuterClass.internal_static_SceneCreateEntityRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SceneCreateEntityRspOuterClass.internal_static_SceneCreateEntityRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SceneCreateEntityRspOuterClass.SceneCreateEntityRsp.class, SceneCreateEntityRspOuterClass.SceneCreateEntityRsp.Builder.class);
      }

      // Construct using SceneCreateEntityRspOuterClass.SceneCreateEntityRsp.newBuilder()
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
        entityId_ = 0;

        if (entityBuilder_ == null) {
          entity_ = null;
        } else {
          entity_ = null;
          entityBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SceneCreateEntityRspOuterClass.internal_static_SceneCreateEntityRsp_descriptor;
      }

      @java.lang.Override
      public SceneCreateEntityRspOuterClass.SceneCreateEntityRsp getDefaultInstanceForType() {
        return SceneCreateEntityRspOuterClass.SceneCreateEntityRsp.getDefaultInstance();
      }

      @java.lang.Override
      public SceneCreateEntityRspOuterClass.SceneCreateEntityRsp build() {
        SceneCreateEntityRspOuterClass.SceneCreateEntityRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SceneCreateEntityRspOuterClass.SceneCreateEntityRsp buildPartial() {
        SceneCreateEntityRspOuterClass.SceneCreateEntityRsp result = new SceneCreateEntityRspOuterClass.SceneCreateEntityRsp(this);
        result.entityId_ = entityId_;
        if (entityBuilder_ == null) {
          result.entity_ = entity_;
        } else {
          result.entity_ = entityBuilder_.build();
        }
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
        if (other instanceof SceneCreateEntityRspOuterClass.SceneCreateEntityRsp) {
          return mergeFrom((SceneCreateEntityRspOuterClass.SceneCreateEntityRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SceneCreateEntityRspOuterClass.SceneCreateEntityRsp other) {
        if (other == SceneCreateEntityRspOuterClass.SceneCreateEntityRsp.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasEntity()) {
          mergeEntity(other.getEntity());
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
        SceneCreateEntityRspOuterClass.SceneCreateEntityRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SceneCreateEntityRspOuterClass.SceneCreateEntityRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 2;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 2;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private CreateEntityInfoOuterClass.CreateEntityInfo entity_;
      private com.google.protobuf.SingleFieldBuilderV3<
          CreateEntityInfoOuterClass.CreateEntityInfo, CreateEntityInfoOuterClass.CreateEntityInfo.Builder, CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> entityBuilder_;
      /**
       * <code>.CreateEntityInfo entity = 4;</code>
       * @return Whether the entity field is set.
       */
      public boolean hasEntity() {
        return entityBuilder_ != null || entity_ != null;
      }
      /**
       * <code>.CreateEntityInfo entity = 4;</code>
       * @return The entity.
       */
      public CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
        if (entityBuilder_ == null) {
          return entity_ == null ? CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        } else {
          return entityBuilder_.getMessage();
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 4;</code>
       */
      public Builder setEntity(CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entity_ = value;
          onChanged();
        } else {
          entityBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 4;</code>
       */
      public Builder setEntity(
          CreateEntityInfoOuterClass.CreateEntityInfo.Builder builderForValue) {
        if (entityBuilder_ == null) {
          entity_ = builderForValue.build();
          onChanged();
        } else {
          entityBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 4;</code>
       */
      public Builder mergeEntity(CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (entity_ != null) {
            entity_ =
              CreateEntityInfoOuterClass.CreateEntityInfo.newBuilder(entity_).mergeFrom(value).buildPartial();
          } else {
            entity_ = value;
          }
          onChanged();
        } else {
          entityBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 4;</code>
       */
      public Builder clearEntity() {
        if (entityBuilder_ == null) {
          entity_ = null;
          onChanged();
        } else {
          entity_ = null;
          entityBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 4;</code>
       */
      public CreateEntityInfoOuterClass.CreateEntityInfo.Builder getEntityBuilder() {
        
        onChanged();
        return getEntityFieldBuilder().getBuilder();
      }
      /**
       * <code>.CreateEntityInfo entity = 4;</code>
       */
      public CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
        if (entityBuilder_ != null) {
          return entityBuilder_.getMessageOrBuilder();
        } else {
          return entity_ == null ?
              CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          CreateEntityInfoOuterClass.CreateEntityInfo, CreateEntityInfoOuterClass.CreateEntityInfo.Builder, CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> 
          getEntityFieldBuilder() {
        if (entityBuilder_ == null) {
          entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              CreateEntityInfoOuterClass.CreateEntityInfo, CreateEntityInfoOuterClass.CreateEntityInfo.Builder, CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder>(
                  getEntity(),
                  getParentForChildren(),
                  isClean());
          entity_ = null;
        }
        return entityBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
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


      // @@protoc_insertion_point(builder_scope:SceneCreateEntityRsp)
    }

    // @@protoc_insertion_point(class_scope:SceneCreateEntityRsp)
    private static final SceneCreateEntityRspOuterClass.SceneCreateEntityRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SceneCreateEntityRspOuterClass.SceneCreateEntityRsp();
    }

    public static SceneCreateEntityRspOuterClass.SceneCreateEntityRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneCreateEntityRsp>
        PARSER = new com.google.protobuf.AbstractParser<SceneCreateEntityRsp>() {
      @java.lang.Override
      public SceneCreateEntityRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneCreateEntityRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneCreateEntityRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneCreateEntityRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SceneCreateEntityRspOuterClass.SceneCreateEntityRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneCreateEntityRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneCreateEntityRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SceneCreateEntityRsp.proto\032\026CreateEnti" +
      "tyInfo.proto\"\255\001\n\024SceneCreateEntityRsp\022\020\n" +
      "\010entityId\030\002 \001(\r\022!\n\006entity\030\004 \001(\0132\021.Create" +
      "EntityInfo\022\017\n\007retcode\030\001 \001(\005\"O\n\013MDAIMAJAH" +
      "BL\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\221\002\022\017\n\013DCDNIL" +
      "FDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          CreateEntityInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneCreateEntityRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneCreateEntityRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneCreateEntityRsp_descriptor,
        new java.lang.String[] { "EntityId", "Entity", "Retcode", });
    CreateEntityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

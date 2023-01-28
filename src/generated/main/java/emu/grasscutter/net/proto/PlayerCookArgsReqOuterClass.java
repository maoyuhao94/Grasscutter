// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerCookArgsReq.proto

public final class PlayerCookArgsReqOuterClass {
  private PlayerCookArgsReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerCookArgsReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerCookArgsReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 recipeId = 5;</code>
     * @return The recipeId.
     */
    int getRecipeId();

    /**
     * <code>uint32 assistAvatar = 9;</code>
     * @return The assistAvatar.
     */
    int getAssistAvatar();
  }
  /**
   * Protobuf type {@code PlayerCookArgsReq}
   */
  public static final class PlayerCookArgsReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerCookArgsReq)
      PlayerCookArgsReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerCookArgsReq.newBuilder() to construct.
    private PlayerCookArgsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerCookArgsReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerCookArgsReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerCookArgsReq(
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

              recipeId_ = input.readUInt32();
              break;
            }
            case 72: {

              assistAvatar_ = input.readUInt32();
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
      return PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PlayerCookArgsReqOuterClass.PlayerCookArgsReq.class, PlayerCookArgsReqOuterClass.PlayerCookArgsReq.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerCookArgsReq.HLKLMLGNJNP}
     */
    public enum HLKLMLGNJNP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 184;</code>
       */
      PEPPOHPHJOJ(1, 184),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final HLKLMLGNJNP DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final HLKLMLGNJNP EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 184;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 184;
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
      public static HLKLMLGNJNP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static HLKLMLGNJNP forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 184: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<HLKLMLGNJNP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          HLKLMLGNJNP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<HLKLMLGNJNP>() {
              public HLKLMLGNJNP findValueByNumber(int number) {
                return HLKLMLGNJNP.forNumber(number);
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
        return PlayerCookArgsReqOuterClass.PlayerCookArgsReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final HLKLMLGNJNP[] VALUES = getStaticValuesArray();
      private static HLKLMLGNJNP[] getStaticValuesArray() {
        return new HLKLMLGNJNP[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static HLKLMLGNJNP valueOf(
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

      private HLKLMLGNJNP(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerCookArgsReq.HLKLMLGNJNP)
    }

    public static final int RECIPEID_FIELD_NUMBER = 5;
    private int recipeId_;
    /**
     * <code>uint32 recipeId = 5;</code>
     * @return The recipeId.
     */
    @java.lang.Override
    public int getRecipeId() {
      return recipeId_;
    }

    public static final int ASSISTAVATAR_FIELD_NUMBER = 9;
    private int assistAvatar_;
    /**
     * <code>uint32 assistAvatar = 9;</code>
     * @return The assistAvatar.
     */
    @java.lang.Override
    public int getAssistAvatar() {
      return assistAvatar_;
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
      if (recipeId_ != 0) {
        output.writeUInt32(5, recipeId_);
      }
      if (assistAvatar_ != 0) {
        output.writeUInt32(9, assistAvatar_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (recipeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, recipeId_);
      }
      if (assistAvatar_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, assistAvatar_);
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
      if (!(obj instanceof PlayerCookArgsReqOuterClass.PlayerCookArgsReq)) {
        return super.equals(obj);
      }
      PlayerCookArgsReqOuterClass.PlayerCookArgsReq other = (PlayerCookArgsReqOuterClass.PlayerCookArgsReq) obj;

      if (getRecipeId()
          != other.getRecipeId()) return false;
      if (getAssistAvatar()
          != other.getAssistAvatar()) return false;
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
      hash = (37 * hash) + RECIPEID_FIELD_NUMBER;
      hash = (53 * hash) + getRecipeId();
      hash = (37 * hash) + ASSISTAVATAR_FIELD_NUMBER;
      hash = (53 * hash) + getAssistAvatar();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
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
    public static Builder newBuilder(PlayerCookArgsReqOuterClass.PlayerCookArgsReq prototype) {
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
     * Protobuf type {@code PlayerCookArgsReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerCookArgsReq)
        PlayerCookArgsReqOuterClass.PlayerCookArgsReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PlayerCookArgsReqOuterClass.PlayerCookArgsReq.class, PlayerCookArgsReqOuterClass.PlayerCookArgsReq.Builder.class);
      }

      // Construct using PlayerCookArgsReqOuterClass.PlayerCookArgsReq.newBuilder()
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
        recipeId_ = 0;

        assistAvatar_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
      }

      @java.lang.Override
      public PlayerCookArgsReqOuterClass.PlayerCookArgsReq getDefaultInstanceForType() {
        return PlayerCookArgsReqOuterClass.PlayerCookArgsReq.getDefaultInstance();
      }

      @java.lang.Override
      public PlayerCookArgsReqOuterClass.PlayerCookArgsReq build() {
        PlayerCookArgsReqOuterClass.PlayerCookArgsReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PlayerCookArgsReqOuterClass.PlayerCookArgsReq buildPartial() {
        PlayerCookArgsReqOuterClass.PlayerCookArgsReq result = new PlayerCookArgsReqOuterClass.PlayerCookArgsReq(this);
        result.recipeId_ = recipeId_;
        result.assistAvatar_ = assistAvatar_;
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
        if (other instanceof PlayerCookArgsReqOuterClass.PlayerCookArgsReq) {
          return mergeFrom((PlayerCookArgsReqOuterClass.PlayerCookArgsReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PlayerCookArgsReqOuterClass.PlayerCookArgsReq other) {
        if (other == PlayerCookArgsReqOuterClass.PlayerCookArgsReq.getDefaultInstance()) return this;
        if (other.getRecipeId() != 0) {
          setRecipeId(other.getRecipeId());
        }
        if (other.getAssistAvatar() != 0) {
          setAssistAvatar(other.getAssistAvatar());
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
        PlayerCookArgsReqOuterClass.PlayerCookArgsReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PlayerCookArgsReqOuterClass.PlayerCookArgsReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int recipeId_ ;
      /**
       * <code>uint32 recipeId = 5;</code>
       * @return The recipeId.
       */
      @java.lang.Override
      public int getRecipeId() {
        return recipeId_;
      }
      /**
       * <code>uint32 recipeId = 5;</code>
       * @param value The recipeId to set.
       * @return This builder for chaining.
       */
      public Builder setRecipeId(int value) {
        
        recipeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 recipeId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRecipeId() {
        
        recipeId_ = 0;
        onChanged();
        return this;
      }

      private int assistAvatar_ ;
      /**
       * <code>uint32 assistAvatar = 9;</code>
       * @return The assistAvatar.
       */
      @java.lang.Override
      public int getAssistAvatar() {
        return assistAvatar_;
      }
      /**
       * <code>uint32 assistAvatar = 9;</code>
       * @param value The assistAvatar to set.
       * @return This builder for chaining.
       */
      public Builder setAssistAvatar(int value) {
        
        assistAvatar_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 assistAvatar = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearAssistAvatar() {
        
        assistAvatar_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerCookArgsReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerCookArgsReq)
    private static final PlayerCookArgsReqOuterClass.PlayerCookArgsReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PlayerCookArgsReqOuterClass.PlayerCookArgsReq();
    }

    public static PlayerCookArgsReqOuterClass.PlayerCookArgsReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerCookArgsReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerCookArgsReq>() {
      @java.lang.Override
      public PlayerCookArgsReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerCookArgsReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerCookArgsReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerCookArgsReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PlayerCookArgsReqOuterClass.PlayerCookArgsReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerCookArgsReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerCookArgsReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PlayerCookArgsReq.proto\"\235\001\n\021PlayerCook" +
      "ArgsReq\022\020\n\010recipeId\030\005 \001(\r\022\024\n\014assistAvata" +
      "r\030\t \001(\r\"`\n\013HLKLMLGNJNP\022\010\n\004NONE\020\000\022\020\n\013PEPP" +
      "OHPHJOJ\020\270\001\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPO" +
      "EA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerCookArgsReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerCookArgsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerCookArgsReq_descriptor,
        new java.lang.String[] { "RecipeId", "AssistAvatar", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

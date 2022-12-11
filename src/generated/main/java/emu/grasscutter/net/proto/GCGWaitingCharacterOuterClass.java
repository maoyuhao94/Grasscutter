// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGWaitingCharacter.proto

package emu.grasscutter.net.proto;

public final class GCGWaitingCharacterOuterClass {
  private GCGWaitingCharacterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGWaitingCharacterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGWaitingCharacter)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cond_count = 1;</code>
     * @return The condCount.
     */
    int getCondCount();

    /**
     * <code>uint32 card_id = 11;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * Protobuf type {@code GCGWaitingCharacter}
   */
  public static final class GCGWaitingCharacter extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGWaitingCharacter)
      GCGWaitingCharacterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGWaitingCharacter.newBuilder() to construct.
    private GCGWaitingCharacter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGWaitingCharacter() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGWaitingCharacter();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGWaitingCharacter(
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

              condCount_ = input.readUInt32();
              break;
            }
            case 88: {

              cardId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.internal_static_GCGWaitingCharacter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.internal_static_GCGWaitingCharacter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter.class, emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter.Builder.class);
    }

    public static final int COND_COUNT_FIELD_NUMBER = 1;
    private int condCount_;
    /**
     * <code>uint32 cond_count = 1;</code>
     * @return The condCount.
     */
    @java.lang.Override
    public int getCondCount() {
      return condCount_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 11;
    private int cardId_;
    /**
     * <code>uint32 card_id = 11;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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
      if (condCount_ != 0) {
        output.writeUInt32(1, condCount_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(11, cardId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (condCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, condCount_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, cardId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter other = (emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter) obj;

      if (getCondCount()
          != other.getCondCount()) return false;
      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + COND_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCondCount();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter prototype) {
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
     * Protobuf type {@code GCGWaitingCharacter}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGWaitingCharacter)
        emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.internal_static_GCGWaitingCharacter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.internal_static_GCGWaitingCharacter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter.class, emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter.newBuilder()
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
        condCount_ = 0;

        cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.internal_static_GCGWaitingCharacter_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter build() {
        emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter buildPartial() {
        emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter result = new emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter(this);
        result.condCount_ = condCount_;
        result.cardId_ = cardId_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter) {
          return mergeFrom((emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter other) {
        if (other == emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter.getDefaultInstance()) return this;
        if (other.getCondCount() != 0) {
          setCondCount(other.getCondCount());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
        emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int condCount_ ;
      /**
       * <code>uint32 cond_count = 1;</code>
       * @return The condCount.
       */
      @java.lang.Override
      public int getCondCount() {
        return condCount_;
      }
      /**
       * <code>uint32 cond_count = 1;</code>
       * @param value The condCount to set.
       * @return This builder for chaining.
       */
      public Builder setCondCount(int value) {
        
        condCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cond_count = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCondCount() {
        
        condCount_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 11;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 11;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGWaitingCharacter)
    }

    // @@protoc_insertion_point(class_scope:GCGWaitingCharacter)
    private static final emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter();
    }

    public static emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGWaitingCharacter>
        PARSER = new com.google.protobuf.AbstractParser<GCGWaitingCharacter>() {
      @java.lang.Override
      public GCGWaitingCharacter parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGWaitingCharacter(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGWaitingCharacter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGWaitingCharacter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGWaitingCharacterOuterClass.GCGWaitingCharacter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGWaitingCharacter_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGWaitingCharacter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031GCGWaitingCharacter.proto\":\n\023GCGWaitin" +
      "gCharacter\022\022\n\ncond_count\030\001 \001(\r\022\017\n\007card_i" +
      "d\030\013 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGWaitingCharacter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGWaitingCharacter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGWaitingCharacter_descriptor,
        new java.lang.String[] { "CondCount", "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Log Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The LogEntry object can describe the definitional format for entries in a Log, or can be used to instantiate the actual entries in the Log.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogEntry#getLogInstanceID <em>Log Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogEntry#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogEntry#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogEntry#getCreationTimeStamp <em>Creation Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogEntry#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogEntry#getMessage <em>Message</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogEntry#getMessageArguments <em>Message Arguments</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogEntry#getOwningEntity <em>Owning Entity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogEntry()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' UMLPackagePath='CIM::System::Logs' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LogEntry extends CIM_RecordForLog {
	/**
	 * Returns the value of the '<em><b>Log Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The containing Log's InstanceID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Instance ID</em>' attribute.
	 * @see #setLogInstanceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogEntry_LogInstanceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getLogInstanceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogEntry#getLogInstanceID <em>Log Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Instance ID</em>' attribute.
	 * @see #getLogInstanceID()
	 * @generated
	 */
	void setLogInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Log Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The containing Log's Name. This property is available for backwards continuity with CIM_LogRecord.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Name</em>' attribute.
	 * @see #setLogName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogEntry_LogName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getLogName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogEntry#getLogName <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Name</em>' attribute.
	 * @see #getLogName()
	 * @generated
	 */
	void setLogName(String value);

	/**
	 * Returns the value of the '<em><b>Record ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RecordID may be used to provide a representation of log entry ordering or pointers/handles for log entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record ID</em>' attribute.
	 * @see #setRecordID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogEntry_RecordID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getRecordID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogEntry#getRecordID <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record ID</em>' attribute.
	 * @see #getRecordID()
	 * @generated
	 */
	void setRecordID(String value);

	/**
	 * Returns the value of the '<em><b>Creation Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LogEntry may include a timestamp for the entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Time Stamp</em>' attribute.
	 * @see #setCreationTimeStamp(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogEntry_CreationTimeStamp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCreationTimeStamp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogEntry#getCreationTimeStamp <em>Creation Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time Stamp</em>' attribute.
	 * @see #getCreationTimeStamp()
	 * @generated
	 */
	void setCreationTimeStamp(String value);

	/**
	 * Returns the value of the '<em><b>Message ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that uniquely identifies, within the scope of the OwningEntity, the format of the Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message ID</em>' attribute.
	 * @see #setMessageID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogEntry_MessageID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LogEntry.Message\",\"CIM_LogEntry.MessageArguments\"]'"
	 * @generated
	 */
	String getMessageID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogEntry#getMessageID <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message ID</em>' attribute.
	 * @see #getMessageID()
	 * @generated
	 */
	void setMessageID(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formatted message. This message is constructed by combining some or all of the dynamic elements specified in the MessageArguments property with the static elements uniquely identified by the MessageID in a message registry or other catalog associated with the OwningEntity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogEntry_Message()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LogEntry.MessageID\",\"CIM_LogEntry.MessageArguments\"]'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogEntry#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Message Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array containing the dynamic content of the message.
	 * Each DYNAMIC_ELEMENT for the message referred to by the MessageID property shall be contained in MessageArguments whether the DYNAMIC_ELEMENT is included in the Message or not.
	 * In addition, the entries in MessageArguments need to be in the same order as the DYNAMIC_ELEMENTs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Arguments</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LogEntry_MessageArguments()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_LogEntry.Message\",\"CIM_LogEntry.MessageID\"]'"
	 * @generated
	 */
	EList<String> getMessageArguments();

	/**
	 * Returns the value of the '<em><b>Owning Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that uniquely identifies the entity that owns the definition of the format of the Message described in this instance. OwningEntity MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or standards body defining the format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Entity</em>' attribute.
	 * @see #setOwningEntity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogEntry_OwningEntity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOwningEntity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogEntry#getOwningEntity <em>Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Entity</em>' attribute.
	 * @see #getOwningEntity()
	 * @generated
	 */
	void setOwningEntity(String value);

} // CIM_LogEntry

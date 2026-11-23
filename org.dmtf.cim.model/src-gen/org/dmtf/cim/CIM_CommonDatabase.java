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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Common Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A database is a collection of interrelated data, treated as a unit, which is organized into one or more schemas. The CIM_CommonDatabase class defines the properties that are common across database model and vendor implementations for the database entity that is represented by the unit of interrelated data. 
 * Databases are manipulated through one or more database services. More detailed information on database services is provided in the description of the CIM_DatabaseService class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CommonDatabase#getDatabaseVersion <em>Database Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CommonDatabase#getLastBackup <em>Last Backup</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CommonDatabase#getSizeAllocated <em>Size Allocated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CommonDatabase#getSizeUnits <em>Size Units</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabase()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Database::System' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CommonDatabase extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>Database Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version number for the database. If the version is not relevant, the value for this property must be set to NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Database Version</em>' attribute.
	 * @see #setDatabaseVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabase_DatabaseVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsDbInfoVersion\"]'"
	 * @generated
	 */
	String getDatabaseVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CommonDatabase#getDatabaseVersion <em>Database Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Version</em>' attribute.
	 * @see #getDatabaseVersion()
	 * @generated
	 */
	void setDatabaseVersion(String value);

	/**
	 * Returns the value of the '<em><b>Last Backup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time when the latest complete or partial backup of the database was performed. If the database has never been backed up, then this property has no meaning. The value of this property should be set to all zeros if the database has never been backed up.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Backup</em>' attribute.
	 * @see #setLastBackup(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabase_LastBackup()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsDbInfoLastBackup\"]'"
	 * @generated
	 */
	String getLastBackup();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CommonDatabase#getLastBackup <em>Last Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Backup</em>' attribute.
	 * @see #getLastBackup()
	 * @generated
	 */
	void setLastBackup(String value);

	/**
	 * Returns the value of the '<em><b>Size Allocated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The estimated amount of disk space (in units) that has been reserved for database use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Allocated</em>' attribute.
	 * @see #setSizeAllocated(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabase_SizeAllocated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsDbInfoSizeAllocated\"]'"
	 * @generated
	 */
	Long getSizeAllocated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CommonDatabase#getSizeAllocated <em>Size Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Allocated</em>' attribute.
	 * @see #getSizeAllocated()
	 * @generated
	 */
	void setSizeAllocated(Long value);

	/**
	 * Returns the value of the '<em><b>Size Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units for the SizeAllocated property and the SizeUsed property that is defined in the CIM_CommonDatabaseStatistics class. Mapping is 1 - Bytes, 2 - Kilobytes, 3 - Megabytes, 4 - Gigabytes and 5 - Terabytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Units</em>' attribute.
	 * @see #setSizeUnits(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabase_SizeUnits()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Bytes\",\"Kilobyes\",\"Megabytes\",\"Gigabytes\",\"Terabytes\"]' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsDbInfoSizeUnits\"]'"
	 * @generated
	 */
	Integer getSizeUnits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CommonDatabase#getSizeUnits <em>Size Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Units</em>' attribute.
	 * @see #getSizeUnits()
	 * @generated
	 */
	void setSizeUnits(Integer value);

} // CIM_CommonDatabase

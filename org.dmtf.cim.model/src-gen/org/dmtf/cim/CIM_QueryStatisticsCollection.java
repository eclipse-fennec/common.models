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
 * A representation of the model object '<em><b>CIM Query Statistics Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of SystemSpecificCollection which collects together statistics and gathers them into an efficient representation. This enables very large numbers of statistics to be efficiently gathered via CIM Indications or Operations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getQuery <em>Query</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getQueryLanguage <em>Query Language</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedEncoding <em>Selected Encoding</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedNames <em>Selected Names</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedTypes <em>Selected Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedValues <em>Selected Values</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedRateNames <em>Selected Rate Names</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedRateTypes <em>Selected Rate Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedRateValues <em>Selected Rate Values</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QueryStatisticsCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageStatistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_QueryStatisticsCollection extends CIM_StatisticsCollection {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query expression that defines information to be placed into the SelectedNames, SelectedTypes, and SelectedValues properties. 
	 * 
	 * The FROM clause MAY reference any class. 
	 * 
	 * An Example using QueryLanguage = "DMTF:CQLT": 
	 * SELECT Stats.* 
	 * FROM CIM_BlockStatisticalData Stats, 
	 * CIM_QueryStatisticsCollection QSC, 
	 * CIM_MemberOfCollection MoC 
	 * Where ObjectPath(QSC) = ObjectPath($SELF$) 
	 * AND ObjectPath(QSC) = MoC.Collection 
	 * AND ObjectPath(Stats) = MoC.Member 
	 * AND CurrentDateTime() >= 
	 * Stats.StatisticTime + Stats.SampleInterval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryStatisticsCollection_Query()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_QueryStatisticsCollection.QueryLanguage\"]'"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Query Language</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language in which the query is expressed. 
	 * CQL: indicates a CIM Query Language string. 
	 * CQLT: indicates a CIM Query Language Template string. When used, the identifiers recognized in the $identifier$ tokens are "SELF" and the property names of this class, or one of its subclasses. When used in the Query string, $SELF$ will be replaced by a string corresponding to a WBEM URI referencing the instance of this class that contains the Query template string. Tokens of the form $<propertyname>$ will be replaced by a string representing the corresponding property value of the instance of this class that contains the Query string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query Language</em>' attribute.
	 * @see #setQueryLanguage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryStatisticsCollection_QueryLanguage()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"CQL\",\"CQLT\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getQueryLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getQueryLanguage <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Language</em>' attribute.
	 * @see #getQueryLanguage()
	 * @generated
	 */
	void setQueryLanguage(Integer value);

	/**
	 * Returns the value of the '<em><b>Selected Encoding</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encoding of the SelectedNames, SelectedTypes, and SelectedValues strings. 
	 * - CSV = Comma Separated Values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected Encoding</em>' attribute.
	 * @see #setSelectedEncoding(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryStatisticsCollection_SelectedEncoding()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"..\",\"0x8000..\"]' Values='[\"CSV\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getSelectedEncoding();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedEncoding <em>Selected Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Encoding</em>' attribute.
	 * @see #getSelectedEncoding()
	 * @generated
	 */
	void setSelectedEncoding(Integer value);

	/**
	 * Returns the value of the '<em><b>Selected Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string containing the Names of the select list entries defined in Query. The encoding is defined by SelectedEncoding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected Names</em>' attribute.
	 * @see #setSelectedNames(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryStatisticsCollection_SelectedNames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_QueryStatisticsCollection.Query\",\"CIM_QueryStatisticsCollection.SelectedEncoding\"]'"
	 * @generated
	 */
	String getSelectedNames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedNames <em>Selected Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Names</em>' attribute.
	 * @see #getSelectedNames()
	 * @generated
	 */
	void setSelectedNames(String value);

	/**
	 * Returns the value of the '<em><b>Selected Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string containing the Types of the select list entries defined in Query. The encoding is defined by SelectedEncoding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected Types</em>' attribute.
	 * @see #setSelectedTypes(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryStatisticsCollection_SelectedTypes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_QueryStatisticsCollection.Query\",\"CIM_QueryStatisticsCollection.SelectedEncoding\"]'"
	 * @generated
	 */
	String getSelectedTypes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedTypes <em>Selected Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Types</em>' attribute.
	 * @see #getSelectedTypes()
	 * @generated
	 */
	void setSelectedTypes(String value);

	/**
	 * Returns the value of the '<em><b>Selected Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string containing a table of Values with the columns corresponding to the select list entries defined in Query. The encoding is defined by SelectedEncoding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected Values</em>' attribute.
	 * @see #setSelectedValues(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryStatisticsCollection_SelectedValues()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_QueryStatisticsCollection.Query\",\"CIM_QueryStatisticsCollection.SelectedEncoding\"]'"
	 * @generated
	 */
	String getSelectedValues();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedValues <em>Selected Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Values</em>' attribute.
	 * @see #getSelectedValues()
	 * @generated
	 */
	void setSelectedValues(String value);

	/**
	 * Returns the value of the '<em><b>Selected Rate Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string containing the Names of the select list rated entries defined in Query. The encoding is defined by SelectedEncoding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected Rate Names</em>' attribute.
	 * @see #setSelectedRateNames(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryStatisticsCollection_SelectedRateNames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_QueryStatisticsCollection.Query\",\"CIM_QueryStatisticsCollection.SelectedEncoding\"]'"
	 * @generated
	 */
	String getSelectedRateNames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedRateNames <em>Selected Rate Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Rate Names</em>' attribute.
	 * @see #getSelectedRateNames()
	 * @generated
	 */
	void setSelectedRateNames(String value);

	/**
	 * Returns the value of the '<em><b>Selected Rate Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string containing the Types of the select list rated entries defined in Query. The encoding is defined by SelectedEncoding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected Rate Types</em>' attribute.
	 * @see #setSelectedRateTypes(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryStatisticsCollection_SelectedRateTypes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_QueryStatisticsCollection.Query\",\"CIM_QueryStatisticsCollection.SelectedEncoding\"]'"
	 * @generated
	 */
	String getSelectedRateTypes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedRateTypes <em>Selected Rate Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Rate Types</em>' attribute.
	 * @see #getSelectedRateTypes()
	 * @generated
	 */
	void setSelectedRateTypes(String value);

	/**
	 * Returns the value of the '<em><b>Selected Rate Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string containing a table of Values with the columns corresponding to the select list rated entries defined in Query. The encoding is defined by SelectedEncoding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected Rate Values</em>' attribute.
	 * @see #setSelectedRateValues(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryStatisticsCollection_SelectedRateValues()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_QueryStatisticsCollection.Query\",\"CIM_QueryStatisticsCollection.SelectedEncoding\"]'"
	 * @generated
	 */
	String getSelectedRateValues();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryStatisticsCollection#getSelectedRateValues <em>Selected Rate Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Rate Values</em>' attribute.
	 * @see #getSelectedRateValues()
	 * @generated
	 */
	void setSelectedRateValues(String value);

} // CIM_QueryStatisticsCollection

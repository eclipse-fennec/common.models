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
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_QueryStatisticsCollection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Query Statistics Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryStatisticsCollectionImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryStatisticsCollectionImpl#getQueryLanguage <em>Query Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryStatisticsCollectionImpl#getSelectedEncoding <em>Selected Encoding</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryStatisticsCollectionImpl#getSelectedNames <em>Selected Names</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryStatisticsCollectionImpl#getSelectedTypes <em>Selected Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryStatisticsCollectionImpl#getSelectedValues <em>Selected Values</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryStatisticsCollectionImpl#getSelectedRateNames <em>Selected Rate Names</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryStatisticsCollectionImpl#getSelectedRateTypes <em>Selected Rate Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueryStatisticsCollectionImpl#getSelectedRateValues <em>Selected Rate Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_QueryStatisticsCollectionImpl extends CIM_StatisticsCollectionImpl implements CIM_QueryStatisticsCollection {
	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryLanguage() <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer QUERY_LANGUAGE_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getQueryLanguage() <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLanguage()
	 * @generated
	 * @ordered
	 */
	protected Integer queryLanguage = QUERY_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectedEncoding() <em>Selected Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SELECTED_ENCODING_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getSelectedEncoding() <em>Selected Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedEncoding()
	 * @generated
	 * @ordered
	 */
	protected Integer selectedEncoding = SELECTED_ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectedNames() <em>Selected Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedNames()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedNames() <em>Selected Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedNames()
	 * @generated
	 * @ordered
	 */
	protected String selectedNames = SELECTED_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectedTypes() <em>Selected Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedTypes()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedTypes() <em>Selected Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedTypes()
	 * @generated
	 * @ordered
	 */
	protected String selectedTypes = SELECTED_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectedValues() <em>Selected Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedValues()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedValues() <em>Selected Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedValues()
	 * @generated
	 * @ordered
	 */
	protected String selectedValues = SELECTED_VALUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectedRateNames() <em>Selected Rate Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedRateNames()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_RATE_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedRateNames() <em>Selected Rate Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedRateNames()
	 * @generated
	 * @ordered
	 */
	protected String selectedRateNames = SELECTED_RATE_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectedRateTypes() <em>Selected Rate Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedRateTypes()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_RATE_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedRateTypes() <em>Selected Rate Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedRateTypes()
	 * @generated
	 * @ordered
	 */
	protected String selectedRateTypes = SELECTED_RATE_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectedRateValues() <em>Selected Rate Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedRateValues()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_RATE_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedRateValues() <em>Selected Rate Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedRateValues()
	 * @generated
	 * @ordered
	 */
	protected String selectedRateValues = SELECTED_RATE_VALUES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_QueryStatisticsCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_QueryStatisticsCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_STATISTICS_COLLECTION__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getQueryLanguage() {
		return queryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueryLanguage(Integer newQueryLanguage) {
		Integer oldQueryLanguage = queryLanguage;
		queryLanguage = newQueryLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_STATISTICS_COLLECTION__QUERY_LANGUAGE, oldQueryLanguage, queryLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSelectedEncoding() {
		return selectedEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectedEncoding(Integer newSelectedEncoding) {
		Integer oldSelectedEncoding = selectedEncoding;
		selectedEncoding = newSelectedEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_ENCODING, oldSelectedEncoding, selectedEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelectedNames() {
		return selectedNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectedNames(String newSelectedNames) {
		String oldSelectedNames = selectedNames;
		selectedNames = newSelectedNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_NAMES, oldSelectedNames, selectedNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelectedTypes() {
		return selectedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectedTypes(String newSelectedTypes) {
		String oldSelectedTypes = selectedTypes;
		selectedTypes = newSelectedTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_TYPES, oldSelectedTypes, selectedTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelectedValues() {
		return selectedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectedValues(String newSelectedValues) {
		String oldSelectedValues = selectedValues;
		selectedValues = newSelectedValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_VALUES, oldSelectedValues, selectedValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelectedRateNames() {
		return selectedRateNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectedRateNames(String newSelectedRateNames) {
		String oldSelectedRateNames = selectedRateNames;
		selectedRateNames = newSelectedRateNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_NAMES, oldSelectedRateNames, selectedRateNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelectedRateTypes() {
		return selectedRateTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectedRateTypes(String newSelectedRateTypes) {
		String oldSelectedRateTypes = selectedRateTypes;
		selectedRateTypes = newSelectedRateTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_TYPES, oldSelectedRateTypes, selectedRateTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelectedRateValues() {
		return selectedRateValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectedRateValues(String newSelectedRateValues) {
		String oldSelectedRateValues = selectedRateValues;
		selectedRateValues = newSelectedRateValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_VALUES, oldSelectedRateValues, selectedRateValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__QUERY:
				return getQuery();
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__QUERY_LANGUAGE:
				return getQueryLanguage();
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_ENCODING:
				return getSelectedEncoding();
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_NAMES:
				return getSelectedNames();
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_TYPES:
				return getSelectedTypes();
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_VALUES:
				return getSelectedValues();
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_NAMES:
				return getSelectedRateNames();
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_TYPES:
				return getSelectedRateTypes();
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_VALUES:
				return getSelectedRateValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__QUERY:
				setQuery((String)newValue);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__QUERY_LANGUAGE:
				setQueryLanguage((Integer)newValue);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_ENCODING:
				setSelectedEncoding((Integer)newValue);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_NAMES:
				setSelectedNames((String)newValue);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_TYPES:
				setSelectedTypes((String)newValue);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_VALUES:
				setSelectedValues((String)newValue);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_NAMES:
				setSelectedRateNames((String)newValue);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_TYPES:
				setSelectedRateTypes((String)newValue);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_VALUES:
				setSelectedRateValues((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__QUERY_LANGUAGE:
				setQueryLanguage(QUERY_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_ENCODING:
				setSelectedEncoding(SELECTED_ENCODING_EDEFAULT);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_NAMES:
				setSelectedNames(SELECTED_NAMES_EDEFAULT);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_TYPES:
				setSelectedTypes(SELECTED_TYPES_EDEFAULT);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_VALUES:
				setSelectedValues(SELECTED_VALUES_EDEFAULT);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_NAMES:
				setSelectedRateNames(SELECTED_RATE_NAMES_EDEFAULT);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_TYPES:
				setSelectedRateTypes(SELECTED_RATE_TYPES_EDEFAULT);
				return;
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_VALUES:
				setSelectedRateValues(SELECTED_RATE_VALUES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__QUERY_LANGUAGE:
				return QUERY_LANGUAGE_EDEFAULT == null ? queryLanguage != null : !QUERY_LANGUAGE_EDEFAULT.equals(queryLanguage);
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_ENCODING:
				return SELECTED_ENCODING_EDEFAULT == null ? selectedEncoding != null : !SELECTED_ENCODING_EDEFAULT.equals(selectedEncoding);
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_NAMES:
				return SELECTED_NAMES_EDEFAULT == null ? selectedNames != null : !SELECTED_NAMES_EDEFAULT.equals(selectedNames);
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_TYPES:
				return SELECTED_TYPES_EDEFAULT == null ? selectedTypes != null : !SELECTED_TYPES_EDEFAULT.equals(selectedTypes);
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_VALUES:
				return SELECTED_VALUES_EDEFAULT == null ? selectedValues != null : !SELECTED_VALUES_EDEFAULT.equals(selectedValues);
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_NAMES:
				return SELECTED_RATE_NAMES_EDEFAULT == null ? selectedRateNames != null : !SELECTED_RATE_NAMES_EDEFAULT.equals(selectedRateNames);
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_TYPES:
				return SELECTED_RATE_TYPES_EDEFAULT == null ? selectedRateTypes != null : !SELECTED_RATE_TYPES_EDEFAULT.equals(selectedRateTypes);
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION__SELECTED_RATE_VALUES:
				return SELECTED_RATE_VALUES_EDEFAULT == null ? selectedRateValues != null : !SELECTED_RATE_VALUES_EDEFAULT.equals(selectedRateValues);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Query: ");
		result.append(query);
		result.append(", QueryLanguage: ");
		result.append(queryLanguage);
		result.append(", SelectedEncoding: ");
		result.append(selectedEncoding);
		result.append(", SelectedNames: ");
		result.append(selectedNames);
		result.append(", SelectedTypes: ");
		result.append(selectedTypes);
		result.append(", SelectedValues: ");
		result.append(selectedValues);
		result.append(", SelectedRateNames: ");
		result.append(selectedRateNames);
		result.append(", SelectedRateTypes: ");
		result.append(selectedRateTypes);
		result.append(", SelectedRateValues: ");
		result.append(selectedRateValues);
		result.append(')');
		return result.toString();
	}

} //CIM_QueryStatisticsCollectionImpl

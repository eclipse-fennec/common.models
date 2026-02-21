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
package de.xoev.schemata.basisnachricht.kommunikation.basiskom;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.xoev.schemata.basisnachricht.kommunikation.basiskom.BasisKommunikationPackage
 * @generated
 */
@ProviderType
public interface BasisKommunikationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasisKommunikationFactory eINSTANCE = de.xoev.schemata.basisnachricht.kommunikation.basiskom.impl.BasisKommunikationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Code Kommunikation Kanal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Kommunikation Kanal Type</em>'.
	 * @generated
	 */
	CodeKommunikationKanalType createCodeKommunikationKanalType();

	/**
	 * Returns a new object of class '<em>Kommunikation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kommunikation Type</em>'.
	 * @generated
	 */
	KommunikationType createKommunikationType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasisKommunikationPackage getBasisKommunikationPackage();

} //BasisKommunikationFactory

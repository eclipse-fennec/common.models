/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl;

import de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasisBehoerdeFactoryImpl extends EFactoryImpl implements BasisBehoerdeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisBehoerdeFactory init() {
		try {
			BasisBehoerdeFactory theBasisBehoerdeFactory = (BasisBehoerdeFactory)EPackage.Registry.INSTANCE.getEFactory(BasisBehoerdePackage.eNS_URI);
			if (theBasisBehoerdeFactory != null) {
				return theBasisBehoerdeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasisBehoerdeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisBehoerdeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BasisBehoerdePackage.BEHOERDE_TYPE: return createBehoerdeType();
			case BasisBehoerdePackage.CODE_VERZEICHNISDIENST_TYPE: return createCodeVerzeichnisdienstType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdeType createBehoerdeType() {
		BehoerdeTypeImpl behoerdeType = new BehoerdeTypeImpl();
		return behoerdeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVerzeichnisdienstType createCodeVerzeichnisdienstType() {
		CodeVerzeichnisdienstTypeImpl codeVerzeichnisdienstType = new CodeVerzeichnisdienstTypeImpl();
		return codeVerzeichnisdienstType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasisBehoerdePackage getBasisBehoerdePackage() {
		return (BasisBehoerdePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasisBehoerdePackage getPackage() {
		return BasisBehoerdePackage.eINSTANCE;
	}

} //BasisBehoerdeFactoryImpl
